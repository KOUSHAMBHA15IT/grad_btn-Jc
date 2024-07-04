package com.example.gradientbutton

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.gradientbutton.ui.theme.GreenL
import com.example.gradientbutton.ui.theme.Purple80


@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
){
    Button(
        colors = ButtonDefaults.buttonColors(

        ),
        contentPadding = PaddingValues(),

        onClick = { onClick() }) {
            Box(modifier = Modifier
                .background(gradient)
                .padding(horizontal = 15.dp, vertical = 10.dp),
                contentAlignment = Alignment.Center){
                Text(text = text, color = textColor)
            }
    }
}

@Preview
@Composable
fun Gradpreview(){
    GradientButton(text = "Button", textColor = Color.Black, gradient = Brush.radialGradient(
        colors = listOf(
            Purple80,GreenL
        )
    ) ) {

    }
}