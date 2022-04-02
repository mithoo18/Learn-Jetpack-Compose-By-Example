package com.example.learn_jetpack_compose_by_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_jetpack_compose_by_example.ui.theme.MyFontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        //Text("Hello Kotlin", fontSize = 30.sp)
        //Disp1()
        //Disp2("Devanshu")
        //Disp3()
        //Disp4()
        //Disp5()
        //Disp6()
        //Disp7()
        //Disp8()
        //Disp9()
        //Disp10()
        //Disp11()
        //Disp12()
        //Disp13()
        //Disp14()
        }
    }

    //Ya Simple Hai
    @Composable
    fun Disp1() {
        Text("Hello Kotlin", fontSize = 30.sp)
    }

    //Parameter Passsing
    @Composable
    fun Disp2(name : String){
        Text("Hello Kt $name")
    }

    //Multiple Text But Problem is overlap
    @Composable
    fun Disp3()
    {
        Text("Hello 1", fontSize = 30.sp)
        Text("Hello 2", fontSize = 30.sp)
        Text("Hello 3", fontSize = 30.sp)
        Text("Hello 4", fontSize = 30.sp)
        Text("Hello 5", fontSize = 30.sp)
    }

    //1 ka nicha 1
    @Composable
    fun Disp4(){
        Column {
            Text("Hello 1", fontSize = 30.sp)
            Text("Hello 2", fontSize = 30.sp)
            Text("Hello 3", fontSize = 30.sp)
            Text("Hello 4", fontSize = 30.sp)
        }
    }

    //Loop
    //Multiple Text But Problem is overlap
    @Composable
    fun Disp5(){
        val names = listOf<String>("Rahul1","Rahul2","Rahul3","Rahul4")
        for(name in names){
            Text("Hello $name")
        }

    }

    //Loop
    //1 ka nicha 1
    @Composable
    fun Disp6(){
        Column{
            val names  = listOf<String>("Rahul1","Rahul2","Rahul3","Rahul4")
            for(name in names){
                Text("Hello $name")
            }
        }
    }

    //Properties Of Text
    @Composable
    fun Disp7(){
        Text(
            "Hello Kotlin",
            fontSize = 30.sp,
            color = Color.Blue,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold
        )

    }


    //Properties + CustomFont
    fun Disp8(){
        Text(
            "Hello Dev",
            fontSize = 30.sp,
            color = Color.Red,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = MyFontFamily
        )
    }

    //Modifier (Background) -> Change Color So to align
    fun Disp9(){
        Text(
            "Hello Devanshu",
            fontSize = 30.sp,
            color = Color.Green,
            fontStyle = FontStyle.Italic,
            fontFamily = MyFontFamily,

            modifier = Modifier.background(color = Color.Yellow)

        )

    }

    //Modifier (Width) -> Change TextField Size
    @Composable
    fun Disp10(){
        Text(
            text = "Hello Me",
            fontSize = 30.sp,
            color =  Color.Green,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = MyFontFamily,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Yellow)
                .width(410.dp)
        )
    }

    //For Long Text (repeat to repeat in same line)
    @Composable
    fun Disp11(){
        Text("Jetpack".repeat(10), fontSize = 30.sp)
    }

    //Max 2 line if extra then not show extra the 2 lines
    @Composable
    fun Disp12(){
        Text("Jetpack".repeat(10), fontSize = 30.sp, maxLines = 2)
    }


    //You can also add space
    @Composable
    fun Disp13(){
        Text("Jetpack _ _".repeat(10), fontSize = 30.sp, maxLines = 2)
    }

    //Selection Of Text
    @Composable
    fun Disp14(){
        SelectionContainer {
            Text("Hello I am Devanshu How Are You", fontSize = 30.sp)
        }
    }




}

