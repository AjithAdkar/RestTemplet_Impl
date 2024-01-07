package com.example.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/s1")
public class S1Controller {
   private final Logger log = Logger.getLogger("s1Controller");

   @Value("${service2.url}")
   private String s2Url;
   @Autowired
   private RestTemplate restTemplate;

    @GetMapping
    public String test1() {
        log.info("s2Controller.class:test1()");
        return "service1";
    }

    @GetMapping("r")
    public ResponseEntity<String> r() {
        log.info("s2Controller.class:test1()");
        return restTemplate.getForEntity(s2Url,String.class);
    }
}
