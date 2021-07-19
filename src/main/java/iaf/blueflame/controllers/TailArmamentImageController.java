package iaf.blueflame.controllers;

import iaf.blueflame.entities.TailArmamentImages;
import iaf.blueflame.services.TailArmamentImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "/images")
public class TailArmamentImageController {
    private final TailArmamentImageService tailArmamentImageService;

    public TailArmamentImageController(TailArmamentImageService tailArmamentImageService) {
        this.tailArmamentImageService = tailArmamentImageService;
    }


}
