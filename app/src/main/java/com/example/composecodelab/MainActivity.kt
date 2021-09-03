package com.example.composecodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecodelab.ui.theme.ComposeCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                Column(modifier = Modifier.
                width(300.dp).fillMaxHeight(0.7f).background(Color.Blue),
                    horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround) {
                    Text(text = "Abhas",color = Color.White)
                    Text(text = "Ravi")
                    Text(text = "Karan")
                }



                }
            }

}


/* @Composable
fun Greeting(name:String){
    Text(text = "Hello $name")
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Greeting(name = "Abhas")
} */

