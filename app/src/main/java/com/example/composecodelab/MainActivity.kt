package com.example.composecodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecodelab.ui.theme.ComposeCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           /* Column(modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                .border(5.dp, Color.Magenta)
                .padding(5.dp)
                .border(5.dp, Color.Blue)
                .padding(5.dp)
                .border(10.dp, Color.Red)
                .padding(80.dp)) {
                    Text(text = "Person1",color = Color.White)
                    Spacer(modifier = Modifier.height(50.dp))
                    Text(text = "Person2")
                    Text(text = "Person3")
                } */
            val painter = painterResource(id = R.drawable.garage1)
            val description = "Garage is shown"
            val title = "ABC Garage"
            Box(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)){
                ImageCard(painter = painter, contentDescription = description, title = title)


            }

            ImageCard(painter = painter, contentDescription = description, title = title)

        }
            }

}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription:String,
    title:String,
    modifier: Modifier = Modifier

){
    Card(modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(15.dp),
    elevation = 5.dp) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(painter = painter, contentDescription = contentDescription,
            contentScale = ContentScale.Crop)

            Box(modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(
                    colors=
                )))

            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title,style = TextStyle(color = Color.White,fontSize = 16.sp))
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

