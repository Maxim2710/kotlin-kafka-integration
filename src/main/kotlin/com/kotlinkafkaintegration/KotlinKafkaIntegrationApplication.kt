package com.kotlinkafkaintegration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinKafkaIntegrationApplication

fun main(args: Array<String>) {
	runApplication<KotlinKafkaIntegrationApplication>(*args)
}
