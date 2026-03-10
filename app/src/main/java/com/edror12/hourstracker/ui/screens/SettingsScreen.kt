package com.edror12.hourstracker.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.edror12.hourstracker.ui.theme.HoursTrackerTheme

@Composable
fun SettingsScreen() {
    Scaffold() { innerPadding ->
        Text(
            text = "Placeholder",
            modifier = Modifier.padding(innerPadding).padding(16.dp)
        )
    }
}

@PreviewScreenSizes
@Composable
fun SettingsScreenPreview() {
    HoursTrackerTheme {
        SettingsScreen()
    }
}
