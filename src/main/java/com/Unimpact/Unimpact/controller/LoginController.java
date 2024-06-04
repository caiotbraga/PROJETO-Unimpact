package com.Unimpact.Unimpact.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {


    @PostMapping("/login")
    public String login(Model m){

        return "";
    }
}
