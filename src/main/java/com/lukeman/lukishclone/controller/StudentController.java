package com.lukeman.lukishclone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @RequestMapping(value = "lukish")
    public String greet(){
      return "Hello Lukeman";
    }
}
