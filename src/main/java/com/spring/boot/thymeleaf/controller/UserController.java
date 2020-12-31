package com.spring.boot.thymeleaf.controller;

import com.spring.boot.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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
        double grade = 90.5;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));
        // return to templates/demo.html

        return "demo";
    }

    @RequestMapping(path = "demo2")
    public String demo2(Model model) {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User(1, "Tom", 30));
        usersList.add(new User(2, "Jerry", 29));
        usersList.add(new User(3, "Nancy", 27));
        model.addAttribute("list", usersList);
        return "demo2";
    }

    private String convertGPA(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade < 90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 70) {
            return "C";
        } else if (grade < 70 && grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

}
