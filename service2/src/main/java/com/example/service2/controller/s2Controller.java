package com.example.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/s2")
public class s2Controller {
   private final Logger log = Logger.getLogger("s1Controller");

    @GetMapping
    public String test1() {
        log.info("s2Controller.class:test1()");
        return "service2";
    }
}
