package com.rizfirsy.mysimplecleanarchitecture.data

import com.rizfirsy.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: MessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}