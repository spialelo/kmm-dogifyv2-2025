package com.nphillips.dogifyv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.nphillips.dogifyv2.model.Breed
import com.nphillips.dogifyv2.usecase.FetchBreedsUseCase
import com.nphillips.dogifyv2.usecase.GetBreedsUseCase
import com.nphillips.dogifyv2.usecase.ToggleFavouriteStateUseCase
import kotlinx.coroutines.launch

suspend fun greet() =
    "${FetchBreedsUseCase().invoke()}\n" +
            "${GetBreedsUseCase().invoke()}\n" +
            "${ToggleFavouriteStateUseCase().invoke(Breed("toggle favourite state test", ""))}\n"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }

        lifecycleScope.launch {
            greet()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}