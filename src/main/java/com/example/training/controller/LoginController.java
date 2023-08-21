package com.example.training.controller;

import com.example.training.domain.Mq;
import com.example.training.service.UserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin")
public class LoginController {

    public static final String VIEW_LOGIN = "admin/login.html";
    public static final String VIEW_INDEX = "admin/index.html";

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Resource
    private UserService userService;

    @GetMapping("")
    public String index() {
        rabbitTemplate.convertAndSend("login.queue", new Mq("Login"));
        return VIEW_LOGIN;
    }

}
