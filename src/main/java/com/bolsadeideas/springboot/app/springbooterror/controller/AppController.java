package com.bolsadeideas.springboot.app.springbooterror.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    @GetMapping("/index")
    public String index() {
        //int num = 8/0;
        Integer valor = Integer.parseInt("a");
        return "index";
    }
}