package com.aptener.bluarmor.testlib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aptener.bluarmor.conversion_library.dpToPx
import com.aptener.bluarmor.conversion_library.pxToDp
import com.aptener.bluarmor.testlib.ui.theme.TestLibTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestLibTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier= modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Box(
            modifier = modifier.size(100f.pxToDp()).background(Color.Blue)
                .scale(1.dp.dpToPx())
                .padding(top = 100f.pxToDp())

        )
    }
}

@Preview(name="Pixel", device = Devices.PIXEL)
@Preview(name="Pixel 6A", device = Devices.PIXEL_6A)
@Preview(name="Pixel 4A", device = Devices.PIXEL_4A)
@Preview(name="Pixel 7 pro", device = Devices.PIXEL_7_PRO)
@Composable
fun GreetingPreview() {
    TestLibTheme {
        Greeting("Android")
    }
}