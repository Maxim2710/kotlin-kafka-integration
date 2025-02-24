package com.kotlinkafkaintegration

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.core.KafkaTemplate

@SpringBootApplication
class KotlinKafkaIntegrationApplication {
	@Bean
	fun commandLineRunner(kafkaTemplate: KafkaTemplate<String, String>) = CommandLineRunner { args ->
		kafkaTemplate.send("test", "hello kafka")
	}
}

fun main(args: Array<String>) {
	runApplication<KotlinKafkaIntegrationApplication>(*args)
}

