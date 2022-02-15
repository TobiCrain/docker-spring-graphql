package com.company.backend.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.company.backend.model.Book
import org.springframework.stereotype.Component

@Component
class BookResolver() : GraphQLQueryResolver {
    fun books(): List<Book> {
        val book1 = Book("1", "name1")
        val book2 = Book("2", "name2")
        return listOf(book1, book2)
    }
    fun book(id: String): Book? {
        return books().find { it.id == id }
    }
    fun randomBook(): Book {
        return books().random()
    }
}