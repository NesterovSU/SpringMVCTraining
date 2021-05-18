package ru.nesterov.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sergey Nesterov
 */

@Controller
public class SecondController {
    @GetMapping("e")
    public String exitPage(){
        return "second/exit";
    }
}
