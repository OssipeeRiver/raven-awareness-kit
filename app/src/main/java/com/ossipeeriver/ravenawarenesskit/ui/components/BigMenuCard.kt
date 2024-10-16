package com.ossipeeriver.ravenawarenesskit.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BigMenuCard(
    modifier: Modifier,
    menuCardHeader: String
) {
    ElevatedCard(
        colors = CardDefaults
            .cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = modifier
            .size(width = 240.dp, height = 150.dp),
        onClick = {}
    ) {
        Box(
            modifier
                .fillMaxWidth()
                .height(145.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = menuCardHeader,
                style = TextStyle(
                    fontSize = 40.sp
                )
            )
        }
    }
}

@Preview
@Composable
fun BigMenuCardPreview() {
    MenuCard(
        modifier = Modifier,
        "Contracts")
}