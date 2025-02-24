package com.kotlinkafkaintegration.listeners

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaListeners {

    @KafkaListener(topics = ["test"],
        groupId = "groupId")
    fun listener(data: String) {
        println("Listener received: $data :)")
    }
}