package com.rizfirsy.mysimplecleanarchitecture.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun MessageScreen(
    viewModel: MessageViewModel = viewModel(factory = MainViewModelFactory.getInstance()),
    modifier: Modifier = Modifier
) {
    var name by remember {
        mutableStateOf("")
    }

    val uiState by viewModel.uiState.collectAsState()

    Scaffold { contentPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(contentPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            uiState.message?.let { Text(text = it.welcomeMessage) }
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Name") }
            )
            Button(onClick = { viewModel.setName(name) }) {
                Text(text = "Send Message")
            }
        }
    }
}
