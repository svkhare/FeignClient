package com.perficient.users.client;

import com.perficient.users.dto.AlbumResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "album-microservice")
public interface AlbumClient {

    @GetMapping("/getAlbums")
    public List<AlbumResponse> getAlbums();

    @GetMapping("/getAlbum/{id}")
    public AlbumResponse getAlbumById(@PathVariable Integer id);
}
