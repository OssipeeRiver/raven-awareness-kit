package com.ossipeeriver.ravenawarenesskit.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ossipeeriver.ravenawarenesskit.ui.presentation.BigMenuCard
import com.ossipeeriver.ravenawarenesskit.ui.presentation.MenuCard
import com.ossipeeriver.ravenawarenesskit.ui.theme.RavenAwarenessKitTheme

@Composable
fun HomeScreen(

) {
    RavenAwarenessKitTheme {
        Surface (modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .padding(
                        start = 25.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
            ) {
                Column {
                    MenuCard(modifier = Modifier,"account")
                    Spacer(modifier = Modifier.padding(5.dp))
                    MenuCard(modifier = Modifier,"planning")
                    Spacer(modifier = Modifier.padding(5.dp))
                    MenuCard(modifier = Modifier,"start Mission")
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column {
                    BigMenuCard(modifier = Modifier,"community")
                    Spacer(modifier = Modifier.padding(5.dp))
                    BigMenuCard(modifier = Modifier,"plugins")
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column {
                    BigMenuCard(modifier = Modifier,"import data")
                    Spacer(modifier = Modifier.padding(5.dp))
                    BigMenuCard(modifier = Modifier,"devices ")
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenMobilePreview() {
    HomeScreen()
}

@Preview
@Composable
fun HomeScreenMediumPreview() {
    HomeScreen()
}

@Preview
@Composable
fun HomeScreenLargePreview() {
    HomeScreen()
}