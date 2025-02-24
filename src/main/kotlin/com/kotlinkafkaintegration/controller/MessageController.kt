package com.kotlinkafkaintegration.controller

import com.kotlinkafkaintegration.dto.MessageRequest
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/messages")
class MessageController(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    @PostMapping
    fun publish(@RequestBody request: MessageRequest) {
        kafkaTemplate.send("test", request.message)
    }
}