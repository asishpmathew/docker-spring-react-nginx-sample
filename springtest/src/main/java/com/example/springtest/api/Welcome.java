package com.example.springtest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/hello")
    public String welcome(@RequestParam(value = "name", defaultValue = "welcome") String name) {
        return String.format("Hello %s", name
        );
    }
}
