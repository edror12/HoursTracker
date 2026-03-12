package com.edror12.hourstracker.ui.screens.components

import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton


@Composable
fun FloatingAddButton(modifier: Modifier = Modifier, onClick: () -> Unit = {}) {
    FloatingActionButton(
        onClick = { onClick() },
        modifier = modifier.padding(16.dp)
    ) {
        Icon(Icons.Default.Add, contentDescription = "Add")
    }
}