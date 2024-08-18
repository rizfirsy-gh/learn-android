package com.rizfirsy.mysimplecleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import com.rizfirsy.mysimplecleanarchitecture.domain.MessageUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MessageViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow(MessageUiState())
    val uiState: StateFlow<MessageUiState> = _uiState.asStateFlow()

    fun setName(name: String) {
        val message = messageUseCase.getMessage(name)
        _uiState.value = MessageUiState(message)
    }
}