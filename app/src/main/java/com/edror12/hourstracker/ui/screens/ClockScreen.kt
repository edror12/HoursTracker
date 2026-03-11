package com.edror12.hourstracker.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp

import com.edror12.hourstracker.ui.screens.components.AnimatedClock
import com.edror12.hourstracker.ui.screens.components.SquaredButton
import com.edror12.hourstracker.ui.screens.components.StatsCard

@PreviewScreenSizes
@Composable
fun ClockScreen() {
    Scaffold() { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            StatsCard(modifier = Modifier.align(Alignment.TopCenter))
            AnimatedClock(modifier = Modifier.align(Alignment.Center))
            Column(modifier = Modifier.align(Alignment.BottomCenter)) {
                SquaredButton()
                SquaredButton()
            }
        }
    }
}