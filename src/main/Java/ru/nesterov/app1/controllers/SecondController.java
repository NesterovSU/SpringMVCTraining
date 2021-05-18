package ru.nesterov.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sergey Nesterov
 */

@Controller
public class SecondController {
    @GetMapping("exit")
    public String exitPage(){
        return "second/exit";
    }
}
