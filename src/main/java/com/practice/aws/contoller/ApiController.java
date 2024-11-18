package com.practice.aws.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class ApiController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloMethod() {
        log.info("Hello world method");
        return new ResponseEntity<>("Hello this is spring boot application", HttpStatus.OK);
    }
}
