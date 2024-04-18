package com.example.inicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inicio.ui.theme.InicioTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InicioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}


@Composable
fun App() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
            horizontalArrangement = Arrangement.Center

        ) {
            Text(
                text = "App Noticias",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        }
        Column(
            Modifier
                .padding(8.dp)
        ) {
        }
        Column(
            Modifier
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Titulo da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Conteúdo Curto da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }

        Column(
            Modifier.padding(8.dp)
        ) {}
        Column(
            Modifier
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Titulo da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Conteúdo Curto da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier.padding(8.dp)
        ) {}
        Column(
            Modifier
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Titulo da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Conteúdo Curto da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier.padding(8.dp)
        ) {}
        Column(
            Modifier
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Titulo da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Conteúdo Curto da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier.padding(8.dp)
        ) {}
        Column(
            Modifier
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Titulo da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Conteúdo Curto da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }
        Column(
            Modifier.padding(8.dp)
        ) {}
        Column(
            Modifier
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Titulo da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Conteúdo Curto da Notícia",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.Red
                )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler Mais")
                }
            }
        }

    }
}

@Preview
@Composable
fun AppPreview() {
    InicioTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}
