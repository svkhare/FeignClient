package com.perficient.album.service;

import com.perficient.album.client.AlbumClient;
import com.perficient.album.dto.AlbumResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumClient albumClient;

    public AlbumResponse getAlbumById(Integer id) {
        List<AlbumResponse> albumResponse = albumClient.getAlbums();
        for (int i = 0; i < albumResponse.size(); i++) {
            if (albumResponse.get(i).getId() == id) {
                return albumResponse.get(i);
            }
        }
        return null;
    }
}
