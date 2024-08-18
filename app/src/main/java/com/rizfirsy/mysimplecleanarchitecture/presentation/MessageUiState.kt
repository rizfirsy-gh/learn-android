package com.rizfirsy.mysimplecleanarchitecture.presentation

import com.rizfirsy.mysimplecleanarchitecture.domain.MessageEntity

data class MessageUiState(
    val message: MessageEntity? = null
)
