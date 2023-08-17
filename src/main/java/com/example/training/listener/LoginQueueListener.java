//package com.example.training.listener;
//
//import com.example.training.domain.Mq;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//@RabbitListener(queues = {"login.queue"})
//public class LoginQueueListener {
//
//    @RabbitHandler
//    public void receive(Mq mq) {
//        System.out.println(mq.getBody());
//    }
//}
