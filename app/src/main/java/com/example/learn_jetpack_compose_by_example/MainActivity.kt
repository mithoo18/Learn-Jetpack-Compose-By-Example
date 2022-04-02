package com.example.learn_jetpack_compose_by_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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




}

