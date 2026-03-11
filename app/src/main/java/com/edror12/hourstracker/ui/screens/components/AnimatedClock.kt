package com.edror12.hourstracker.ui.screens.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Preview
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedClock(modifier: Modifier = Modifier) {
    var secondsElapsed by remember { mutableIntStateOf(0) }
    var isRunning by remember { mutableStateOf(false) }

    // Coroutine to increment seconds
    LaunchedEffect(isRunning) {
        while (isRunning) {
            delay(1000L)
            secondsElapsed += 1
        }
    }

    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Text("00:", style = MaterialTheme.typography.displayMedium)
            AnimatedContent(targetState = (secondsElapsed / 60) / 10, transitionSpec = {
                (slideInVertically { height -> height } + fadeIn(
                    animationSpec = tween(300)
                )) togetherWith
                        (slideOutVertically { height -> -height } + fadeOut(
                            animationSpec = tween(300)
                        ))
            }) { value ->
                Text(text = "$value", style = MaterialTheme.typography.displayMedium)
            }
            AnimatedContent(targetState = (secondsElapsed / 60) % 10, transitionSpec = {
                (slideInVertically { height -> height } + fadeIn(
                    animationSpec = tween(300)
                )) togetherWith
                        (slideOutVertically { height -> -height } + fadeOut(
                            animationSpec = tween(300)
                        ))
            }) { value ->
                Text(text = "$value", style = MaterialTheme.typography.displayMedium)
            }
            Text(text = ":", style = MaterialTheme.typography.displayMedium)
            AnimatedContent(targetState = (secondsElapsed % 60) / 10, transitionSpec = {
                (slideInVertically { height -> height } + fadeIn(
                    animationSpec = tween(300)
                )) togetherWith
                        (slideOutVertically { height -> -height } + fadeOut(
                            animationSpec = tween(300)
                        ))
            }) { value ->
                Text(text = "$value", style = MaterialTheme.typography.displayMedium)
            }
            AnimatedContent(targetState = (secondsElapsed % 60) % 10, transitionSpec = {
                (slideInVertically { height -> height } + fadeIn(
                    animationSpec = tween(300)
                )) togetherWith
                        (slideOutVertically { height -> -height } + fadeOut(
                            animationSpec = tween(300)
                        ))
            }) { value ->
                Text(text = "$value", style = MaterialTheme.typography.displayMedium)
            }
        }

//        Spacer(modifier = Modifier.height(16.dp))
//
//        Row {
//            Button(onClick = { isRunning = true }) { Text("Start") }
//            Spacer(modifier = Modifier.width(8.dp))
//            Button(onClick = { isRunning = false }) { Text("Stop") }
//            Spacer(modifier = Modifier.width(8.dp))
//            Button(onClick = { secondsElapsed = 0; isRunning = false }) { Text("Reset") }
//        }
    }
}

