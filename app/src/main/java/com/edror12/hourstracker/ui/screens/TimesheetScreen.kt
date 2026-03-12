package com.edror12.hourstracker.ui.screens

import java.time.LocalTime
import java.time.LocalDate
import java.time.Duration
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
import com.edror12.hourstracker.R
import com.edror12.hourstracker.ui.screens.components.FloatingAddButton
import com.edror12.hourstracker.ui.screens.components.GenericFloatingEntry
import java.util.Locale

data class Shift(
    val job: String,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val startDate: LocalDate,
)


@OptIn(ExperimentalMaterial3Api::class)
@PreviewScreenSizes
@Composable
fun TimesheetScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text("Timesheet") }) }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 10.dp)
        ) {
            val shifts = listOf(
                Shift(
                    "Job 1",
                    LocalTime.of(7, 30),
                    LocalTime.of(14, 52),
                    LocalDate.of(2026, 3, 12)
                ),
                Shift(
                    "Job 2",
                    LocalTime.of(8, 2),
                    LocalTime.of(15, 30),
                    LocalDate.of(2026, 3, 13)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(8, 30),
                    LocalTime.of(18, 38),
                    LocalDate.of(2026, 3, 14)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(17, 30),
                    LocalDate.of(2026, 3, 15)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(14, 30),
                    LocalDate.of(2026, 3, 12)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(15, 30),
                    LocalDate.of(2026, 3, 13)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(16, 30),
                    LocalDate.of(2026, 3, 14)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(17, 30),
                    LocalDate.of(2026, 3, 15)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(14, 30),
                    LocalDate.of(2026, 3, 12)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(15, 30),
                    LocalDate.of(2026, 3, 13)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(16, 30),
                    LocalDate.of(2026, 3, 14)
                ),
                Shift(
                    "Job 1",
                    LocalTime.of(14, 30),
                    LocalTime.of(17, 30),
                    LocalDate.of(2026, 3, 15)
                ),
            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(shifts) {
                    // TODO: All of these need to be calculated on clock out.
                    val duration: Duration = Duration.between(it.startTime, it.endTime)
                    val durationString = String.format(
                        Locale.getDefault(),
                        "%d hr %d min",
                        duration.toHours(),
                        duration.toMinutes() % 60
                    )
                    val ratePerHour = 13.0
                    val cost = ratePerHour * (duration.toMinutes() / 60.0)

                    GenericFloatingEntry(
                        icon = R.drawable.info_circle_svgrepo_com_2_,
                        entryTitle = it.job,
                        entryDescription = "Rate: $%.2f/Hour".format(ratePerHour),
                        rightDetailTop = durationString,
                        rightDetailBottom = "$%.2f".format(cost)

                    )
                }
                item { Spacer(modifier = Modifier.padding(vertical = 5.dp)) }
            }
            FloatingAddButton(modifier = Modifier.align(Alignment.BottomEnd), onClick = { })
        }
    }
}

