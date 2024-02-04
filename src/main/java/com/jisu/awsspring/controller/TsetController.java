package com.jisu.awsspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TsetController {

    @GetMapping
    public String test() {
        return "hello aws is working fine";
    }

    @GetMapping("/{name}")
    public String getGreet(@PathVariable String name) {
        return "Hello ! " + name;
    }

}
