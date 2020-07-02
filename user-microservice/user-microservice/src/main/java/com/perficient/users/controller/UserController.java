package com.perficient.users.controller;

import com.perficient.users.client.UserClient;
import com.perficient.users.dto.UserResponse;
import com.perficient.users.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(description = " ")
public class UserController {

    @Autowired
    private UserClient userClient;

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    @ApiOperation("Feign Client Get All Users")
    public List<UserResponse> findAllUsers() {
        return userClient.getUsers();
    }

    @GetMapping("/getUser/{id}/{album_id}")
    @ApiOperation("Feign Client get User by Id")
    public UserResponse findUsersById(@PathVariable Integer id, @PathVariable Integer album_id){
        return userService.getUserById(id,album_id);
    }

    @GetMapping("/hello-world")
    @ApiOperation("Hello World")
    public String sayHello() {
        return "Docker image created and running....!";
    }
}
