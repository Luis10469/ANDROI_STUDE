
package com.example.firts_proyect.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firts_proyect.ui.theme.Firts_proyectTheme

@Composable
fun Home(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier
            .fillMaxSize()
            .padding(12.dp),
        color = Color.White,
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(2.dp, Color.DarkGray)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            // PRIMER BOX: TÍTULO
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .border(
                        2.dp,
                        Color.DarkGray,
                        RoundedCornerShape(18.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "hola",
                    fontSize = 26.sp
                )
            }


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .border(
                        2.dp,
                        Color.DarkGray,
                        RoundedCornerShape(18.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    repeat(3) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(100.dp)
                                .border(
                                    2.dp,
                                    Color.DarkGray,
                                    RoundedCornerShape(16.dp)
                                )
                        )
                    }
                }
            }

            // TERCER BOX: PARTE INFERIOR
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .border(
                        2.dp,
                        Color.DarkGray,
                        RoundedCornerShape(18.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Text(
                        text = "hello word",
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "hello",
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomePreview() {
    Firts_proyectTheme {
        Home()
    }
}
