package io.u02.controller;

import io.u02.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/downloadImage")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @RequestMapping("/download")
    public String request() {
        return imageService.downloadImage();
    }

    @RequestMapping("/{fileName}")
    public String request(@PathVariable("fileName") String fName) {
        return imageService.downloadImage(fName);
    }

}
