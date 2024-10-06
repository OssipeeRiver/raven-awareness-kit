package com.ossipeeriver.ravenawarenesskit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ossipeeriver.ravenawarenesskit.ui.screens.EsriScreen
import com.ossipeeriver.ravenawarenesskit.ui.theme.RavenAwarenessKitTheme

class EsriScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RavenAwarenessKitTheme {
               EsriScreen()
            }
        }
    }

}