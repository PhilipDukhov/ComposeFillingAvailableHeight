package com.example.fillingavailableheight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.fillingavailableheight.ui.theme.FillingAvailableHeightTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FillingAvailableHeightTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Row {
                        Content(100, modifier = Modifier.weight(1f))
                        Content(3, modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

@Composable
fun Content(
    count: Int,
    modifier: Modifier,
) {
    Column(modifier = modifier) {
        LazyColumn(modifier = Modifier.fillMaxWidth().weight(1f)) {
            items(count) { item ->
                Text(item.toString())
            }
            item {
                Spacer(modifier = Modifier.weight(1f))
            }
        }
        Row {
            Button({}) {}
            Button({}) {}
        }
    }
}