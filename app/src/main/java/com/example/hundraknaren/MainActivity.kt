
package com.example.hundraknaren

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.core.provider.FontsContractCompat
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.PaddingValues
import android.util.Log
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Hundraknare()
        }
    }
}

@Composable
fun Hundraknare() {
    var antal by remember { mutableStateOf(0) }

    Text("Min hundräknare 🐾")
    Text("Antal träningspass: $antal")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Min hundräknare 🐾")
        Text("Antal träningspass: $antal")
        Button(
            onClick = {
                antal = antal + 1
                Log.d("Hundraknaren", "Antal träningspass: $antal")

            },
            modifier = Modifier.padding(16.dp),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(
                horizontal = 32.dp,
                vertical = 20.dp
            )
        ) {
            Text("Tryck här")
        }
    }
}





