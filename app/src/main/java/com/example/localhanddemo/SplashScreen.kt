package com.example.localhanddemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.localhanddemo.ui.theme.LocalHandDemoTheme
import com.example.localhanddemo.ui.theme.*

@Composable
fun SplashScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = backgroundColor
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(207.dp)
                    .height(52.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LocalHandDemoTheme {
        SplashScreen()
    }
}