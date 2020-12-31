package com.spring.boot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mohammed Amr
 * @created 31/12/2020 - 21:05
 * @project spring-boot-thymeleaf
 */

@Controller
public class UserController {


    @RequestMapping(path = "demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        // return to templates/demo.html
        return "demo";
    }

}
