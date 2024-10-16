package com.ossipeeriver.ravenawarenesskit.ui.esri

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ossipeeriver.ravenawarenesskit.ui.esri.EsriScreen
import com.ossipeeriver.ravenawarenesskit.ui.theme.RavenAwarenessKitTheme

class EsriActivity : ComponentActivity() {
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