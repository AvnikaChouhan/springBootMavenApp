package com.Maven.springBootMavenApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Maven.springBootMavenApp.service.IGreetingService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
    public class controller {
        @Autowired
        private IGreetingService service;
        @GetMapping("/greeting")
        public String greetingWish1(Model model) {
            String res=service.generateGreeting();
            model.addAttribute("Wish", res);

            return "Hello";
        }
        @GetMapping("/test")
        @ResponseBody
        public String test() {
            return "Controller is working";
        }
    }

