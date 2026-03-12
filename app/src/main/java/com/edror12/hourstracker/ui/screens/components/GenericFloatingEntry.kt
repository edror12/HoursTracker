package com.edror12.hourstracker.ui.screens.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edror12.hourstracker.R

@Preview(showBackground = true)
@Composable
fun GenericFloatingEntry(
    @DrawableRes icon: Int = R.drawable.info_circle_svgrepo_com_2_,
    entryTitle: String = "Entry",
    entryDescription: String = "Description",
    rightDetailTop: String = "Up",
    rightDetailBottom: String = "Down",
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ), colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ), modifier = Modifier
            .height(80.dp)
            .fillMaxWidth(0.95f)
            .padding(vertical = 5.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .fillMaxSize()
                    .clickable { },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(icon),
                    contentDescription = "Medicine Icon",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(end = 20.dp),
                    colorFilter = ColorFilter.tint(
                        MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f)
                    )
                )
                Column {
                    Text(
                        text = entryTitle,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = entryDescription,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            Column(
                modifier = Modifier.align(Alignment.CenterEnd),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = rightDetailTop,
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = rightDetailBottom,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

