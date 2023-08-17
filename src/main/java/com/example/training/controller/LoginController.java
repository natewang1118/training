package com.example.training.controller;

import com.example.training.domain.Mq;
import com.example.training.domain.User;
import com.example.training.service.UserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Objects;

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
        return VIEW_LOGIN;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        rabbitTemplate.convertAndSend("login.queue", new Mq("Login"));
        if (Objects.isNull(userService.findByAccount(user.getUsername()))) {
            return VIEW_LOGIN;
        } else {
            return VIEW_INDEX;
        }

    }

}
