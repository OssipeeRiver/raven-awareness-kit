package com.ossipeeriver.ravenawarenesskit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ossipeeriver.ravenawarenesskit.ui.screens.EsriScreen
import com.ossipeeriver.ravenawarenesskit.ui.screens.HomeScreen
import com.ossipeeriver.ravenawarenesskit.ui.theme.RavenAwarenessKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RavenAwarenessKitTheme {
                //RunApp()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RavenAwarenessKitTheme {
        EsriScreen()
    }
}