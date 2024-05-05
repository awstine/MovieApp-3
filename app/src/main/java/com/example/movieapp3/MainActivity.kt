@file:Suppress("ktlint:standard:import-ordering")

package com.example.movieapp3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
                                        .padding(top = 18.dp),
                                fontSize = 40.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Left,
                                text = "Movie App",
                            )
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = null,
                            )
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
