package com.edror12.hourstracker.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.edror12.hourstracker.ui.screens.components.FloatingAddButton
import com.edror12.hourstracker.ui.screens.components.GenericFloatingEntry

@OptIn(ExperimentalMaterial3Api::class)
@PreviewScreenSizes
@Composable
fun JobsScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text("Jobs") }) }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 10.dp)
        ) {
            val jobs: List<String> = listOf(
                "Job 1", "Job 2", "Job 3", "Job 4", "Job 5", "Job 6", "Job 7", "Job 8", "Job 9",
                "Job 10", "Job 11"
            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(jobs) {
                    GenericFloatingEntry(
                        entryTitle = it,
                        entryDescription = "Company one day job",
                        rightDetailTop = "Rate",
                        rightDetailBottom = "$10.00"
                    )
                }
                item {
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                }
            }
            FloatingAddButton(modifier = Modifier.align(Alignment.BottomEnd), onClick = { })
        }
    }
}
