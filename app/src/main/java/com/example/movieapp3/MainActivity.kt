package com.example.movieapp3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.RowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapp3.ui.theme.MovieApp3Theme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieApp3Theme {
                // A surface container using the 'background' color from the theme
                val movies = listOf(
                    R.drawable.baby,
                    R.drawable.bank,
                    R.drawable.thieves,
                    R.drawable.terminal
                )
                Scaffold(
                    topBar = {
                        Row(
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(top = 18.dp),
                                fontSize = 50.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Left,
                                text = "Movve"
                            )
                            
                            Icon(
                                painter = painterResource(id = R.drawable.glass),
                                contentDescription = null,
                                modifier = Modifier.size(25.dp)
                            )

                        }
                    }


                ) { innerPadding ->

                    LazyColumn(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(horizontal = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        item {
                            Text(text = "Popular Movies")
                            Spacer(modifier = Modifier.height(15.dp))
                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Column(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.bank),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp),
                                                    //.align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "The bank Job",
                                                color = Color.Green,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold

                                            )

                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.thieves),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Army of Thieves",
                                                color = Color.Green,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )

                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.triple),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Triple Threat",
                                                color = Color.Green,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.baby),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Baby Driver",
                                                color = Color.Green,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                        }

                        item {
                            Text(text = "TV Show")
                            Spacer(modifier = Modifier.height(15.dp))
                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.bank),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "The bank Job",
                                                color = Color.LightGray,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.thieves),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Army of Thieves",
                                                color = Color.LightGray,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.triple),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Triple Threat",
                                                color = Color.LightGray,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.baby),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Baby Driver",
                                                color = Color.LightGray,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(15.dp))
                        }

                        item {
                            Text(text = "Continue Watching")
                            Spacer(modifier = Modifier.height(15.dp))
                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.bank),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "The bank Job",
                                                color = Color.Black,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.thieves),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Army of Thieves",
                                                color = Color.Black,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.triple),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Triple threat",
                                                color = Color.Black,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.baby),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Baby Driver",
                                                color = Color.Black,
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(15.dp))
                        }

                        item {
                            Text(text = "Top Charts")
                            Spacer(modifier = Modifier.height(15.dp))
                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.bank),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "The bank Job"
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.thieves),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Thieves"
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.triple),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Triple"
                                            )
                                        }
                                    }
                                }
                                item {
                                    Card(
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(220.dp)
                                    ) {
                                        Box(modifier = Modifier.fillMaxWidth()) {
                                            Image(
                                                painter = painterResource(id = R.drawable.baby),
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Text(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(8.dp)
                                                    .align(Alignment.BottomStart),
                                                textAlign = TextAlign.Start,
                                                text = "Baby"
                                            )
                                        }
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(15.dp))
                        }
                    }

                    //another section

                }

            }
        }
    }
}

