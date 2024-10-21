@file:OptIn(ExperimentalMaterial3Api::class)

package com.ossipeeriver.ravenawarenesskit.ui.esri

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment
import com.arcgismaps.geometry.Point
import com.arcgismaps.geometry.SpatialReference
import com.arcgismaps.mapping.ArcGISScene
import com.arcgismaps.mapping.ArcGISTiledElevationSource
import com.arcgismaps.mapping.BasemapStyle
import com.arcgismaps.mapping.Surface
import com.arcgismaps.mapping.Viewpoint
import com.arcgismaps.mapping.view.Camera
import com.arcgismaps.toolkit.geoviewcompose.SceneView
import com.ossipeeriver.ravenawarenesskit.BuildConfig
import com.ossipeeriver.ravenawarenesskit.data.constants.EsriConstants.ESRI_3D_SOURCE

@Composable
fun EsriScreen() {

    val scene = remember {
        setEsriApiKey()
        createScene()
    }

    Scaffold() {
        SceneView(
            modifier = Modifier.fillMaxSize().padding(it),
            arcGISScene = scene
        )

    }

}

fun createScene(): ArcGISScene {
    val uri = ESRI_3D_SOURCE
    val elevationSource = ArcGISTiledElevationSource(uri)
    val surface = Surface().apply {
        elevationSources.add(elevationSource)
        elevationExaggeration = 2.5f
    }

    val cameraLocation = Point(
        x = -118.794,
        y = 33.909,
        z = 5330.0,
        spatialReference = SpatialReference.wgs84()
    )

    val camera = Camera(
        locationPoint = cameraLocation,
        heading = 355.0,
        pitch = 72.0,
        roll = 0.0
    )

    return ArcGISScene(BasemapStyle.ArcGISImagery).apply {

        baseSurface = surface

        initialViewpoint = Viewpoint(cameraLocation, camera)

    }
}

private fun setEsriApiKey() {
    val ESRI_KEY = BuildConfig.ESRI_KEY
    ArcGISEnvironment.apiKey = ApiKey.create(ESRI_KEY)
}

@Preview
@Composable
fun EriScreenPreview() {
    EsriScreen()
}


