import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Window {

    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    fun Theme() {
        var tfText by remember { mutableStateOf(TextFieldValue()) }

        MaterialTheme {

            Box(modifier = Modifier.fillMaxSize().background(Color.Blue), contentAlignment = Alignment.TopCenter) {
                Column(modifier = Modifier.background(Color.Transparent)) {
                    Text(
                        text = "Numbers Calculation Game", fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White

                    )

                }

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(
                        modifier = Modifier.background(Color.White, RoundedCornerShape(10.dp)).width(300.dp)
                            .height(100.dp).clip(RoundedCornerShape(20.dp)),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally


                    ) {
                        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.background(Color.White)) {
                            Text(text = "0", modifier = Modifier.align(Alignment.CenterVertically))
                        }
                        Row(modifier = Modifier.padding(15.dp)) {
                            Text(text = "Score")
                        }
                    }
                }
                Box(
                    modifier = Modifier.fillMaxSize().padding(vertical = 100.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Column(
                        modifier = Modifier.background(Color.White, RoundedCornerShape(10.dp)).width(300.dp)
                            .height(120.dp).clip(RoundedCornerShape(20.dp)),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row() {
                            Text(text = "Question", modifier = Modifier.align(Alignment.Top))
                        }

                        Row() {
                            Text(
                                text = "23 + 66 =",
                                modifier = Modifier.align(Alignment.CenterVertically).padding(vertical = 20.dp)
                                    .height(IntrinsicSize.Min)

                            )
                            Column(modifier = Modifier.width(200.dp).padding(start = 30.dp)) {
                                TextField(value = tfText,
                                    modifier = Modifier.padding(vertical = 20.dp),
                                    onValueChange = { tfText = it },
                                    colors = TextFieldDefaults.textFieldColors(textColor = Color.Black),
                                    placeholder = { Text("write here") })
                            }

                        }
                    }

                }


            }

        }

    }
}




