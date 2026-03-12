package com.edror12.hourstracker.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.PreviewScreenSizes

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.edror12.hourstracker.ui.screens.components.StatsCard
import com.edror12.hourstracker.ui.screens.components.AnimatedClock
import com.edror12.hourstracker.ui.screens.components.ControlButtons
import com.edror12.hourstracker.ui.screens.components.JobsMenu

@PreviewScreenSizes
@Composable
fun ClockScreen() {
    Scaffold() { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(bottom = 30.dp)
        ) {
            StatsCard(modifier = Modifier.align(Alignment.TopCenter))
            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Clocked out",
                    modifier = Modifier.padding(vertical = 20.dp),
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                )
                AnimatedClock()
                JobsMenu()
            }
            Column(
                modifier = Modifier.align(Alignment.BottomCenter),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                ControlButtons()
            }
        }
    }
}
