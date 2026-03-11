package com.edror12.hourstracker.ui.screens.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SquaredButton(
    modifier: Modifier = Modifier,
    title: String = "Placeholder",
    onClick: () -> Unit = {},
) {
    FilledTonalButton(
        onClick = { onClick() },
        contentPadding = PaddingValues(
//            horizontal = 120.dp,
            vertical = 16.dp
        ),
        shape = RoundedCornerShape(15.dp),
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth(0.8f),
        colors = ButtonColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
            disabledContentColor = MaterialTheme.colorScheme.secondary
        )
    ) {
        Text(text = title)
    }
}