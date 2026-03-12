package com.edror12.hourstracker.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun JobsMenu(
    jobs: List<String> = listOf(
        "Job 1",
        "Job 2",
        "Job 3",
        "Job 4",
        "Job 5",
        "Job 6",
        "Job 7",
        "Job 8",
        "Job 9",
    )
) {
    var expanded by remember { mutableStateOf(false) }
    var selected by remember { mutableStateOf(jobs[0]) }

    Column(
        modifier = Modifier.padding(vertical = 12.dp)
    ) {
        Button(
            onClick = { expanded = true },
            shape = RoundedCornerShape(15.dp),
            colors = ButtonColors(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground,
                disabledContainerColor = MaterialTheme.colorScheme.background,
                disabledContentColor = MaterialTheme.colorScheme.onBackground
            )
        ) {
            Row {
                Text(text = selected)
                Spacer(modifier = Modifier.size(5.dp))
                Icon(
                    modifier = Modifier.size(20.dp),
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = ""
                )

            }
        }
        DropdownMenu(
            expanded = expanded,
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.heightIn(max = 150.dp),
            onDismissRequest = { expanded = false }
        ) {
            jobs.forEach {
                DropdownMenuItem(
                    text = { Text(it) },
                    onClick = {
                        selected = it
                        expanded = false
                    }
                )
            }
        }
    }
}
