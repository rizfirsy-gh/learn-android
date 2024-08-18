package com.rizfirsy.mysimplecleanarchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.rizfirsy.mysimplecleanarchitecture.presentation.MessageScreen
import com.rizfirsy.mysimplecleanarchitecture.ui.theme.MySimpleCleanArchitectureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MySimpleCleanArchitectureTheme {
                MessageScreen()
            }
        }
    }
}
