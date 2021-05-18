package ru.nesterov.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sergey Nesterov
 */

@Controller
public class FirstController {
    @GetMapping("/h")
    public String helloPage(){
        return "first/hello";
    }

    @GetMapping("/b")
    public String byePage(){
    return "first/bye";
    }
}
