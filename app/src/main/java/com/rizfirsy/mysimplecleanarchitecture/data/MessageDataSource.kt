package com.rizfirsy.mysimplecleanarchitecture.data

import com.rizfirsy.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}