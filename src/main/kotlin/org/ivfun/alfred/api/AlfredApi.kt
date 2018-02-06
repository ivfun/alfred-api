package org.ivfun.alfred.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AlfredApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(AlfredApiApplication::class.java, *args)
}
