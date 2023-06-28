package com.task6.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetingController {
    @GetMapping("/localdatetime")
    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }
}
