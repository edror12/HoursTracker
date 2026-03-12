package com.edror12.hourstracker.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edror12.hourstracker.R


@Composable
fun CardSeparator() {
    VerticalDivider(
        modifier = Modifier.height(40.dp),
        color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.4f)
    )
}

@Composable
fun EarningsCard() {
    Column(
        modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(32.dp).padding(vertical = 3.dp),
            painter = painterResource(R.drawable.dollar_svgrepo_com_1_),
            contentDescription = "",
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onBackground)
        )
        Text(text = "$0.00",
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,

        )
        Text(text = " Earnings",
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 12.sp)
    }
}

@Composable
fun BreakCard() {
    Column(
        modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(35.dp).padding(vertical = 0.dp),
            painter = painterResource(R.drawable.coffee_mug_svgrepo_com),
            contentDescription = "",
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onBackground)
        )
        Text(text = "0m",
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,

        )
        Text(text = "Break",
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 12.sp)
    }
}

@Composable
fun OvertimeCard() {
    Column(
        modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(35.dp).padding(vertical = 3.dp),
            painter = painterResource(R.drawable.clock_lines_svgrepo_com_2_),
            contentDescription = "",
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onBackground)
        )
        Text(text = "0m",
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )
        Text(text = "Overtime",
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 12.sp)
    }
}


@Composable
fun StatsCard(modifier: Modifier = Modifier) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ), colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ), modifier = modifier
            .padding(20.dp)
            .height(120.dp)
            .fillMaxWidth(0.95f)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            EarningsCard()
            CardSeparator()
            BreakCard()
            CardSeparator()
            OvertimeCard()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatsCardPreview() {
    StatsCard()
}

