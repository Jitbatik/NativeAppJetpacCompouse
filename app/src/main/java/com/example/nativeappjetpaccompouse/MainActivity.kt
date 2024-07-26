package com.example.nativeappjetpaccompouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.nativeappjetpaccompouse.presentation.screen.MainScreen
import com.example.nativeappjetpaccompouse.ui.theme.NativeAppJetpacCompouseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NativeAppJetpacCompouseTheme {
                MainScreen()
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun MyApp() {
    NativeAppJetpacCompouseTheme {
        MainScreen()
    }
}