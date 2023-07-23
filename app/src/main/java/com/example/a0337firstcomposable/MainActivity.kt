package com.example.a0337firstcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           // Text("Hello Mohammed")
            Mohammedview()
        Nameview("Ahmed")
        }

    }
}
@Preview(showSystemUi = true)
@Composable
fun Mohammedview (){
    Text("Hello Mohammed21")
}

@Composable
fun Nameview ( name : String ){
    Text("Hello $name " , color = Color.Blue)
}
