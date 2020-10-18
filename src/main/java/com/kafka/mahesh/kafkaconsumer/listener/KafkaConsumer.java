package com.kafka.mahesh.kafkaconsumer.listener;

import com.kafka.mahesh.kafkaconsumer.model.User;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    //  @KafkaListener(topics = "Kafka_Example",groupId = "group_id")
    public void consume(String message) {
        System.out.println("**************************"+message);
    }

    //  @KafkaListener(topics = "Kafka_Example",groupId = "group_json", containerFactory = "userFactory")
    public void consumeJson(User user) {
        System.out.println("***********user***************"+user.getName());
    }
}
