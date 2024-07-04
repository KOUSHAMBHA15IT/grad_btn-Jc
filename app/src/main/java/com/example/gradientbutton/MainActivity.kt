package com.example.gradientbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gradientbutton.ui.theme.GradientButtonTheme
import com.example.gradientbutton.ui.theme.GreenL
import com.example.gradientbutton.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GradientButtonTheme {
                Row(
                    modifier = Modifier.fillMaxSize(),

                    horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                    GradientButton(text = "Button", textColor = androidx.compose.ui.graphics.Color.Black, gradient = Brush.radialGradient(
                        colors = listOf(
                            Purple80,GreenL
                        )
                    ) ) {

                    }
                }


            }
        }
    }
}

