package com.example.jinung.part3.ch04.springIntroduction.put.controller;

import com.example.jinung.part3.ch04.springIntroduction.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId) {
        System.out.println("userId = " + userId);
        System.out.println(putRequestDto);
        return putRequestDto;
    }
}
