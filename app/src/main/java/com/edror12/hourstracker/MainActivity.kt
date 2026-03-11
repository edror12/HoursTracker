package com.edror12.hourstracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.edror12.hourstracker.ui.screens.ClockScreen
import com.edror12.hourstracker.ui.theme.HoursTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HoursTrackerTheme {
                ClockScreen()
            }
        }
    }
}
