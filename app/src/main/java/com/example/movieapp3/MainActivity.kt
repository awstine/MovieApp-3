@file:Suppress("ktlint:standard:import-ordering")

package com.example.movieapp3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
// import androidx.compose.foundation.layout.BoxScopeInstance.align
// import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Row
// import androidx.compose.foundation.layout.RowScopeInstance.align
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
                var isSearchVisible by remember { mutableStateOf(false) }
                val movies =
                    listOf(
                        R.drawable.baby,
                        R.drawable.bank,
                        R.drawable.thieves,
                        R.drawable.terminal,
                    )
                Scaffold(
                    topBar = {
                        Row(
                            modifier =
                                Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                modifier =
                                    Modifier
                                        .weight(1f)
                                        .padding(top = 10.dp),
                                fontSize = 40.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Left,
                                text = "Movie App",
                            )
                            IconButton(
                                onClick = { isSearchVisible = !isSearchVisible },
                                modifier =
                                    Modifier
                                        .size(55.dp)
                                        .background(Color.Transparent),
                            ) {
                                Icon(Icons.Default.Search, contentDescription = null)
                            }
                            if (isSearchVisible) {
                                var text by remember { mutableStateOf("") }
                                TextField(
                                    value = text,
                                    onValueChange = { newText ->
                                        text = newText
                                    },
                                    placeholder = { Text(text = "Search") },
                                    modifier = Modifier.fillMaxWidth(),
                                    colors =
                                        TextFieldDefaults.colors(
                                            cursorColor = Color.White,
                                            // leadingIconColor = Color.White,
                                            // backgroundColor = Color.Transparent,
                                            focusedIndicatorColor = Color.Transparent,
                                            unfocusedIndicatorColor = Color.Transparent,
                                            disabledTextColor = Color.White,
                                        ),
                                    textStyle = TextStyle(color = Color.White),
                                )
                            }
//                            Icon(
//                                painter = painterResource(id = R.drawable.glass),
//                                contentDescription = null,
//                                modifier = Modifier.size(25.dp),
//                            )
                        }
                    },
                ) { innerPadding ->

                    LazyColumn(
                        modifier =
                            Modifier
                                .padding(innerPadding)
                                .padding(horizontal = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                    ) {
                        item {
                            Text(text = "Popular Movies")
                            Spacer(modifier = Modifier.height(15.dp))
                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                            ) {
                                items(movies) { movie ->
                                    Card(
                                        modifier =
                                            Modifier
                                                .width(150.dp)
                                                .height(220.dp),
                                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                    ) {
                                        Image(
                                            painter = painterResource(id = movie),
                                            contentDescription = null,
                                            modifier = Modifier.fillMaxSize(),
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text("Continue Watching")

                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                            ) {
                                items(movies) { movie ->
                                    Card(
                                        modifier =
                                            Modifier
                                                .width(150.dp)
                                                .height(220.dp),
                                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                    ) {
                                        Image(
                                            painter = painterResource(id = movie),
                                            contentDescription = null,
                                            modifier = Modifier.fillMaxSize(),
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(15.dp))
                            Text("Latest release")

                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                            ) {
                                items(movies) { movie ->
                                    Card(
                                        modifier =
                                            Modifier
                                                .width(150.dp)
                                                .height(220.dp),
                                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                    ) {
                                        Image(
                                            painter = painterResource(id = movie),
                                            contentDescription = null,
                                            modifier = Modifier.fillMaxSize(),
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(15.dp))
                            Text("Must Watch")

                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                            ) {
                                items(movies) { movie ->
                                    Card(
                                        modifier =
                                            Modifier
                                                .width(150.dp)
                                                .height(220.dp),
                                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                    ) {
                                        Image(
                                            painter = painterResource(id = movie),
                                            contentDescription = null,
                                            modifier = Modifier.fillMaxSize(),
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Suppress("ktlint:standard:function-naming")
    @Composable
    fun MovieCard() {
        val movies =
            listOf(
                R.drawable.baby,
                R.drawable.bank,
                R.drawable.thieves,
                R.drawable.terminal,
            )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(movies) { movie ->
                Card(
                    modifier =
                        Modifier
                            .width(150.dp)
                            .height(220.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                ) {
                    Image(
                        painter = painterResource(id = movie),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            }
        }
    }
}
