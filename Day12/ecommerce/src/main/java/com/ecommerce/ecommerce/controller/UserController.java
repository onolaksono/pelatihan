package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dto.CreateUserDto;
import com.ecommerce.ecommerce.service.UserService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @SneakyThrows(Exception.class)
    @PostMapping(path = "/user/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody CreateUserDto dto){

        log.info("api /api/v1/user fro POST is excuted....");

        return userService.create(dto);
    }
}
