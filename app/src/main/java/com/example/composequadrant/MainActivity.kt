package com.example.composequadrant
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.statusBars

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CompiledComposable()
                }
            }
        }
    }
}

@Composable
fun CompiledComposable() {
    Row(modifier = Modifier.fillMaxSize()
        .padding(WindowInsets.statusBars.asPaddingValues())
    ){
        Column(modifier = Modifier
                            .weight(1f)
        ){
            Box( modifier = Modifier
                            .weight(1f)
                            .background(colorResource(id = R.color.quadrant1))
                            .fillMaxSize(1f),


            ){
                Column(modifier = Modifier.fillMaxSize()
                    .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = stringResource(R.string.text_title),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)

                    )
                    Text(
                        text = stringResource(R.string.text_desc),
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .background(colorResource(id = R.color.quadrant3))
                .fillMaxSize(1f)
            ){
                Column(modifier = Modifier.fillMaxSize()
                    .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = stringResource(R.string.row_title),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)

                    )
                    Text(
                        text = stringResource(R.string.row_desc),
                        textAlign = TextAlign.Justify

                    )
                }
            }
        }
        Column(modifier = Modifier
                            .weight(1f)
        ){
            Box( modifier = Modifier
                            .weight(1f)
                            .background(colorResource(id = R.color.quadrant2))
                            .fillMaxSize(1f)
            ){
                Column(modifier = Modifier.fillMaxSize()
                    .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = stringResource(R.string.image_title),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)

                    )
                    Text(
                        text = stringResource(R.string.image_desc),
                        textAlign = TextAlign.Justify

                    )
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .background(colorResource(id = R.color.quadrant4))
                .fillMaxSize(1f)
            ){
                Column(modifier = Modifier.fillMaxSize()
                    .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = stringResource(R.string.column_title) ,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)

                    )
                    Text(
                        text = stringResource(R.string.column_desc),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        CompiledComposable()
    }
}