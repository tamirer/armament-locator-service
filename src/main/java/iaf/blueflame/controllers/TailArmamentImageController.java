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

    @GetMapping("/preflight/{tailId}")
    public String test(@PathVariable long tailId) {
        return "Hello";
    }

    @PostMapping("/preflight")
    public TailArmamentImages uploadPreflightImage(@RequestParam("tailId") Long tailId,
                                                   @RequestParam("file") MultipartFile file) throws IOException {
        return this.tailArmamentImageService.uploadPreflightImage(tailId, file);
    }
}
