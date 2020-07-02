package com.perficient.users.client;

import com.perficient.users.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USER-CLIENT", url = "https://jsonplaceholder.typicode.com/")
public interface UserClient {

    @GetMapping("/users")
    public List<UserResponse> getUsers();
}
