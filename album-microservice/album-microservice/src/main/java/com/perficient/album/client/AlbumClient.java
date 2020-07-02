package com.perficient.album.client;

import com.perficient.album.dto.AlbumResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "USER-CLIENT", url = "https://jsonplaceholder.typicode.com")
public interface AlbumClient {

    @GetMapping("/albums")
    public List<AlbumResponse> getAlbums();
}
