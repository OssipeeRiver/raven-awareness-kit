package com.ossipeeriver.ravenawarenesskit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment
import com.ossipeeriver.ravenawarenesskit.ui.screens.EsriScreen
import com.ossipeeriver.ravenawarenesskit.ui.theme.RavenAwarenessKitTheme

val ESRI_KEY = "AAPTxy8BH1VEsoebNVZXo8HurJvYAIxYl-QPqy5CQs5LnbVNCK50nJn4GH1oYltEKto4yWFyEZJdjcN2GknttWFWK1GTRbqExL97j7cDTuP4dRH0csPQo2kysptK9IzUcLnUXv0X6tzk6UMv0ppGzJQbd6obCVJ8_A451sOQHXaskAuGWAIptii5ecEqdhAl8bbmYVAqkq5DhMPhkkPkfh9t1FVURFlJSjDc9aAgT_jy34A.AT1_O8YZOmtm"

class EsriActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setEsriApiKey()
        setContent {
            RavenAwarenessKitTheme {
                EsriScreen()
            }
        }
    }
    private fun setEsriApiKey() {
        ArcGISEnvironment.apiKey = ApiKey.create(ESRI_KEY)

    }
}