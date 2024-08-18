package com.rizfirsy.mysimplecleanarchitecture.di

import com.rizfirsy.mysimplecleanarchitecture.data.MessageDataSource
import com.rizfirsy.mysimplecleanarchitecture.data.MessageRepository
import com.rizfirsy.mysimplecleanarchitecture.domain.MessageInteractor
import com.rizfirsy.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): MessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSource()
    }
}