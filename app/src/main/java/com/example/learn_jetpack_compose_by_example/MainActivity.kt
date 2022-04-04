package com.example.learn_jetpack_compose_by_example

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
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
        //Disp15()
        //Disp16()
        //Disp17()
        //Disp18()
        //Disp19()
        //Disp20()
        //Disp21()
        //Disp22()
        //Disp23()
        //Disp24()
        //Disp25()
        //Disp26()
        //Disp27()
        //Disp28()
        //Disp29()
        //Disp30()
        //Disp31()
        //Disp32()
        //Disp33()
        //Disp34()
        //Disp35()
        //Disp36()
        //Disp37()
        //Disp37()
        //Disp38()
        //Disp39()
        //Disp40()
        //Disp41()
        //Disp42()
        //Disp43()
        //Disp44()
        //Disp45()


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

    //Selection _ NonSelection
    @Composable
    fun Disp15(){
        Column{
            SelectionContainer {
                Text("This Is Selectable Text", fontSize = 30.sp)
            }
            Text("This Is Not Selectable Text",fontSize = 30.sp)
        }

    }

    //Selection,NonSelection,Disable_Selection
    @Composable
    fun Disp16(){
     Column {
         SelectionContainer {
             Text("This Is Selectable Text",fontSize = 30.sp)

             DisableSelection {
                 Text("This Is Not Selectable", fontSize = 30.sp)
             }
         }
         Text("This Is Non Selectable",fontSize = 30.sp)
     }

    }

    //Left to Right || Row Wise -> 1 | 2 | 3
    @Composable
    fun Disp17(){
        Row{
            Text("Devanshu", fontSize = 30.sp)
            Text("Ishika", fontSize = 30.sp)
            Text("Mits", fontSize = 30.sp)
        }
    }


    //Center TextBox
    @Composable
    fun Disp18(){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        )
        {
            Text("Devanshu", fontSize = 30.sp)
            Text("Mits",fontSize = 30.sp)
            Text("Demo",fontSize = 30.sp)
        }

    }

    //Center with modifier Right_Left
    @Composable
    fun Disp19(){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray),
            horizontalArrangement = Arrangement.Center
        ){
            Text("Hello ", fontSize = 30.sp)
            Text("Jetpack ",fontSize = 30.sp)
            Text("Kotlin ",fontSize = 30.sp)
        }

    }

    //Center horizontally, Vertically
    @Composable
    fun Disp20(){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color.LightGray),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text("Hello ", fontSize = 30.sp)
            Text("Jetpack ",fontSize= 30.sp)
            Text("Kotlin ", fontSize = 30.sp)
        }
    }

    //Scrollable
    @Composable
    fun Disp21(){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color.LightGray),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text("Hello 1", fontSize = 30.sp)
            Text("Hello 2", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("First", fontSize = 30.sp)
            Text("Hello Last", fontSize = 30.sp)
        }
    }

    // Center ->Horizontally
    // Center ->Vertically

    //We can also Use fillMaxSize -> fillMaxWidth X fillMaxHeight
    // 1 ka nicha 1
    @Composable
    fun Disp22(){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color.LightGray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
        Text("Hello ", fontSize = 30.sp)
        Text("Jetpack", fontSize = 30.sp)
        Text("Me", fontSize = 30.sp)
        Text("Who", fontSize = 30.sp)

        }
    }

    //fillMaxSize(0.5f) This will set fraction of total Size
    @Composable
    fun Disp23(){
        Column(
            modifier = Modifier
                .fillMaxSize(0.5f)
                .background(Color.LightGray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            ){
            Text("Hello ", fontSize = 30.sp)
            Text("Jetpack ", fontSize = 30.sp)
            Text("Kotlin ",fontSize = 30.sp)
        }
    }

    //For Vertical Scrolling
    @Composable
    fun Disp24(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Text("Hello 1", fontSize = 30.sp)
        Text("Hello 2", fontSize = 30.sp)
        Text("Hello 3", fontSize = 30.sp)
        Text("Hello 4",fontSize = 30.sp)
        Text("hello 5", fontSize = 30.sp)
        Text("Hello 1", fontSize = 30.sp)
        Text("Hello 2", fontSize = 30.sp)
        Text("Hello 3", fontSize = 30.sp)
        Text("Hello 4",fontSize = 30.sp)
        Text("hello 5", fontSize = 30.sp)
        Text("Hello 1", fontSize = 30.sp)
        Text("Hello 2", fontSize = 30.sp)
        Text("Hello 3", fontSize = 30.sp)
        Text("Hello 4",fontSize = 30.sp)
        Text("hello 5", fontSize = 30.sp)
        Text("Hello 1", fontSize = 30.sp)
        Text("Hello 2", fontSize = 30.sp)
        Text("Hello 3", fontSize = 30.sp)
        Text("Hello 4",fontSize = 30.sp)
        Text("hello 5", fontSize = 30.sp)
        Text("Hello 1", fontSize = 30.sp)
        Text("Hello 2", fontSize = 30.sp)
        Text("Hello 3", fontSize = 30.sp)
        Text("Hello 4",fontSize = 30.sp)
        Text("hello 5", fontSize = 30.sp)

        }

    }

    //Vertical Scrolling with Loop
    @Composable
    fun Disp25(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text("First", fontSize = 30.sp)
            for (i in 0..50){
            Text("Item $i", fontSize = 30.sp)
            }
            Text("Last", fontSize = 30.sp)

        }
    }

    //Lazy -> To Decrease Loading Time
    @Composable
    fun Disp26(){
        LazyRow(
            modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxHeight(),
             verticalAlignment = Alignment.CenterVertically)
        {
            item { Text("First Item", fontSize = 30.sp) }
            items(50){ i-> Text(" Item $i", fontSize = 30.sp)}
            item{ Text("Last Item", fontSize = 30.sp) }
        }
    }

    //Lazy + Padding
    @Composable
    fun Disp27()
    {
        LazyRow(
            modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            contentPadding = PaddingValues(horizontal = 100.dp, vertical = 10.dp)
        ){

            item { Text("First Item", fontSize = 30.sp) }
            items(50){i-> Text(" Item $i", fontSize = 30.sp)}
            item{ Text("Last Item", fontSize = 30.sp) }
        }

    }

    //Lazy + Padding + Horizontal Space
    @Composable
    fun Disp28(){
        LazyRow(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxHeight(),

            verticalAlignment = Alignment.CenterVertically,
            contentPadding = PaddingValues(horizontal = 100.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(50.dp)
        ){

        }
    }

    @Composable
    fun Disp29()
    {
        LazyColumn (
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(10.dp,100.dp),
        verticalArrangement = Arrangement.spacedBy(50.dp)
        ){
            item{ Text("First Item", fontSize = 30.sp) }
            items(50){ i-> Text(" Items $i", fontSize = 30.sp)}
            item{ Text("Last Item", fontSize = 30.sp)}
        }
    }

    //Box -> Square, Take a part from Parent
    @Composable
    fun Disp30(){
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(color = Color.Yellow)
        )
        {
            Text("This Is Outer Box")
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(0.5f)
                    .background(color = Color.Blue)
            ){
                    Text("This Is Inner Box")
            }
        }

    }

    @Composable
    fun Disp31(){
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth(0.5f)
                .background(color = Color.Blue)
        ){
            Text("This Is Outer Box",
            modifier = Modifier.align(Alignment.Center))
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
                    .background(color = Color.Yellow)
            ){
                Text("This is Inner Box",
                color = Color.Red,
                modifier = Modifier.align(Alignment.Center))
            }
        }
    }

    @Composable
    fun Disp32(){
        Scaffold(
        topBar = {
                TopAppBar(
                    title = {
                        Text("Material App")
                    }, actions = {
                        IconButton(onClick = {
                            Log.d("Button Clicked","Search Button Clicked")
                        }){
                            Icon(Icons.Filled.Search, contentDescription = null)
                        }
                    }
                )
            }
        ){}
    }

    @Composable
    fun Disp33(){
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("Material App Exp")
                    }, actions = {
                        IconButton(onClick = {
                            Log.d("Button Clicked","Search Button On")
                        }){
                            Icon(Icons.Filled.Search, contentDescription = null)
                        }
                    }
                )
            }
        ){
            Disp32()
        }
    }

    @Composable
    fun Disp34(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Profile Images 1"
        )
    }

    @Composable
    fun Disp35(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile Images 2",
            modifier = Modifier
                .border(5.5.dp, color = Color.Red)
                .size(300.dp)
        )
    }

    @Composable
    fun Disp36(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile Image 3",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .border(5.5.dp,Color.Red, CircleShape)
                .size(300.dp)
                .clip(shape = CircleShape)
        )
    }

    //Image Loading From Internet
    @Composable
    fun Disp37(){
        Image(
            painter = rememberImagePainter
            (
                data = "https://picsum.photos/200"
            ),
            contentDescription = "Profile Image 4",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .border(5.5.dp,Color.Red, CircleShape)
                .size(300.dp)
                .clip(shape = CircleShape)
        )
    }

    //High Image From Assets
    @Composable
    fun Disp38(){
        Icon(
            Icons.Filled.Menu,
            contentDescription = "Menu",
            modifier = Modifier.size(40.dp),
            tint = Color.Red
        )

    }

    //Card + Border
    @Composable
    fun Disp39(){
        Card(
            shape = RoundedCornerShape(10.dp),
            backgroundColor = Color.Gray,
            border = BorderStroke(5.dp,Color.Red),
            contentColor = Color.White,
        ){
            Column(modifier = Modifier.padding(40.dp)){
                Text(
                    text = "This Is Card",
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }

    //Card + Bac
    @Composable
    fun Disp40(){
        Card(
            shape = RoundedCornerShape(10.dp),
            backgroundColor = Color.Gray,
            border = BorderStroke(5.dp,Color.Red),
            contentColor = Color.White,
        ){
            Column(modifier = Modifier.padding(40.dp)){
                Text(
                    text = "This Is a Card",
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(100.dp))
                Text(
                    text = "Jetpack",
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }

    /* STATEFULL COMPONENT */

    @Composable
    fun Disp49(){

    }

    @Composable
    fun Dis50(){

    }

    @Composable
    fun Disp51(){

    }

    @Composable
    fun Disp52(){

    }

    @Composable
    fun Disp53(){

    }

    @Composable
    fun Disp54(){

    }

}

