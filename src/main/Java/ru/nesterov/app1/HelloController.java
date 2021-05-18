package ru.nesterov.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sergey Nesterov
 */

@Controller
public class HelloController {
    @GetMapping("/h")
    public String sayHello(){
        return "hello";
    }
}
