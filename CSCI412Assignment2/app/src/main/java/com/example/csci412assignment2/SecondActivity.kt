package com.example.csci412assignment2
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.csci412assignment2.ui.theme.CSCI412Assignment2Theme
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CSCI412Assignment2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Challenges(modifier = Modifier.padding(innerPadding))
                }
            }
        }

    }
}

@Composable
fun Challenges(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column {
        Text(
            text = "Five mobile software engineering challenges\n" +
                    "Device Fragmentation\n" +
                    "\tA large number of different device configurations\n"
                    + "OS Fragmentation\n" +
                    "\tDeveloping apps for multiple platforms\n"
                    + "Unstable and Dynamic Environment\n" +
                    "\tProvide access to key features and data in unstable environment\n"
                    + "Rapid Changes\n" +
                    "\tDifficult to keep up with the changes. Require significant development and maintenance effort\n"
                    + "Low Tolerance\n" +
                    "\tUsers are highly likely to uninstall unstable and unresponsive apps",
            modifier = modifier.padding(24.dp)
        )
        Button(onClick = {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Main Activity")
        }
    }
}