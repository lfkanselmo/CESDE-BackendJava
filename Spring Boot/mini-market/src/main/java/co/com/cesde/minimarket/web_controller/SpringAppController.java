package co.com.cesde.minimarket.web_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say-hi")
public class SpringAppController {
    @GetMapping("/hello")
    public String hello(){
        String name = "Spring-Boot";
        return "Hello World " + name;
    }
}
