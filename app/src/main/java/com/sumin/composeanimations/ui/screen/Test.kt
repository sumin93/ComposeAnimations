package com.sumin.composeanimations.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Test() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .verticalScroll(
                state = rememberScrollState(),
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(
                text = "Animate size",
            )
        }
        AnimatedContainer(
            text = "Size"
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(
                text = "Animate shape",
            )
        }
        AnimatedContainer(
            text = "Shape"
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(
                text = "Animate border",
            )
        }
        AnimatedContainer(
            text = "Border"
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(
                text = "Animate color",
            )
        }
        AnimatedContainer(
            text = "Color"
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(
                text = "Animate visibility",
            )
        }
        AnimatedContainer(
            text = "Visibility"
        )
    }
}

@Composable
private fun AnimatedContainer(
    text: String
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Blue)
            .size(200.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}
