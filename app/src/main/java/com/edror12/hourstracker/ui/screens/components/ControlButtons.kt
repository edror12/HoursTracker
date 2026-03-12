package com.edror12.hourstracker.ui.screens.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback

@Composable
fun ControlButtons() {
    val haptic = LocalHapticFeedback.current
    var isClockedIn by remember { mutableStateOf(false) }

    AnimatedVisibility(
        visible = isClockedIn,
        enter = fadeIn(animationSpec = tween(200)) +
                expandVertically(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessMedium
                    ),
                    expandFrom = Alignment.Top
                ),
        exit = fadeOut(animationSpec = tween(150)) +
                shrinkVertically(
                    animationSpec = tween(200),
                    shrinkTowards = Alignment.Top
                )
    ) {
        SquaredButton()
    }
    SquaredButton(
        onClick = {
            isClockedIn = !isClockedIn
            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
        }
    )
}