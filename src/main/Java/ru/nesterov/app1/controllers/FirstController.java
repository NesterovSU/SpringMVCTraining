package ru.nesterov.app1.controllers;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Sergey Nesterov
 */

@Controller
public class FirstController {
    @GetMapping("calculator")
    public String helloPage(@RequestParam(value = "param1", required = false) float param1,
                            @RequestParam(value = "param2", required = false) float param2,
                            @RequestParam(value = "action", required = false) String action,
                            Model model){

        String message;
        float result;
        switch (action){
            case "addition" :
                result = param1 + param2;
                break;
            case "multiplication" :
                result = param1 * param2;
                break;
            case "division" :
                result = param1 / param2;
                break;
            case "subtraction" :
                result = param1 - param2;
                break;
            default:
                model.addAttribute("message", "Input incorrect action");
                return "calculator";
        }

        message = "Result: " + result;
        model.addAttribute("message", message);
        return "calculator";
    }
}

