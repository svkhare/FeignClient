package com.perficient.album.controller;

import com.perficient.album.client.AlbumClient;
import com.perficient.album.dto.AlbumResponse;
import com.perficient.album.service.AlbumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = " ")
public class AlbumController {

    @Autowired
    private AlbumClient albumClient;

    @Autowired
    private AlbumService albumService;

    @GetMapping("/getAlbums")
    @ApiOperation("Feign Client Get All Albums")
    public List<AlbumResponse> findAllAlbums() {
        return albumClient.getAlbums();
    }

    @GetMapping("/getAlbum/{id}")
    @ApiOperation("Feign Client get Album by Id")
    public AlbumResponse findAlbumsById(@PathVariable("id") Integer id) {
        return albumService.getAlbumById(id);
    }
}
