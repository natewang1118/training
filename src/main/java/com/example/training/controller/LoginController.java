//package com.example.training.controller;
//
//import com.example.training.domain.User;
//import com.example.training.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.annotation.Resource;
//import java.util.Objects;
//
//@Controller
//public class LoginController {
//
//    public static final String VIEW_LOGIN = "admin/login.html";
//    public static final String VIEW_INDEX = "admin/index.html";
//
//    @Resource
//    private UserService userService;
//
//    @GetMapping("")
//    public String index() {
//        return VIEW_LOGIN;
//    }
//
//    @PostMapping("/login")
//    public String login(@ModelAttribute User user) {
//        if (Objects.isNull(userService.findByAccount(user.getUser()))) {
//            return VIEW_LOGIN;
//        } else {
//            return VIEW_INDEX;
//        }
//
//    }
//
//}
