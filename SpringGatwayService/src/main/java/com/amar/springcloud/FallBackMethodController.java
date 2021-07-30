package com.amar.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallback")
    public String userFallbackMethodController() {
        return "User service is taking longer time so please try again latter.";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentFallbackMethodController() {
        return "Department service is taking longer time please try again latter.";
    }
}
