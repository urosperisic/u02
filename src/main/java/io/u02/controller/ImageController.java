package io.u02.controller;

import io.u02.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @RequestMapping("/downloadImage")
    public String[] request() { return imageService.downloadImage(); }

}
