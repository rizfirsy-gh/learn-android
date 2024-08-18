package com.rizfirsy.mysimplecleanarchitecture.data

import com.rizfirsy.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}