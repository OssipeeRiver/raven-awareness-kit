package com.ossipeeriver.ravenawarenesskit.ui.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MenuCard(
    header: String
) {
    Card(
        modifier = Modifier,
        onClick = {}
    ) {
        Text(header)
    }
}

@Preview
@Composable
fun MenuCardPreview() {
    MenuCard("Home")
}