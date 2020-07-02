package com.perficient.users.service;

import com.perficient.users.client.AlbumClient;
import com.perficient.users.client.UserClient;
import com.perficient.users.dto.AlbumResponse;
import com.perficient.users.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserClient userClient;

    @Autowired
    private AlbumClient albumClient;


    public UserResponse getUserById(Integer id,Integer album_id) {
        AlbumResponse abc=null;
        List<UserResponse> userResponse = userClient.getUsers();
        for (int i = 0; i < userResponse.size(); i++) {
            if (userResponse.get(i).getId() == id) {
                if(id == album_id){
                     abc = albumClient.getAlbumById(album_id);
                }
                userResponse.get(i).setAlbumResponseById(abc);
                return userResponse.get(i);
            }
        }
        return null;
    }
}
