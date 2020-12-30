package org.tsc.todoList

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication(proxyBeanMethods = false)
class TodoListApplication

fun main(args: Array<String>) {
    runApplication<TodoListApplication>(*args)
}
