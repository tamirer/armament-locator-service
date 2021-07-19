package iaf.blueflame.controllers;

import iaf.blueflame.entities.Tail;
import iaf.blueflame.entities.TailArmamentImages;
import iaf.blueflame.services.TailArmamentImageService;
import iaf.blueflame.services.TailService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/tails")
public class TailController {
    private final TailService tailService;

    public TailController(TailService tailService) {
        this.tailService = tailService;
    }

    @GetMapping
    public List<Tail> getTails() {
        return tailService.getTails();
    }

    @GetMapping("{tailId}")
    public Tail getSquad(@PathVariable long tailId) {
        return tailService.getTail(tailId);
    }

    @PostMapping("{tailId}/preflight")
    public TailArmamentImages uploadPreflightImage(@PathVariable long tailId,
                                                   @RequestParam("file") MultipartFile file) throws IOException {
        return this.tailArmamentImageService.uploadPreflightImage(tailId, file);
    }

    @PostMapping("{tailId}/afterflight")
    public TailArmamentImages uploadAfterFlightImage(@PathVariable long tailId,
                                                     @RequestBody MultipartFile file) throws IOException {
        return this.tailArmamentImageService.uploadPreflightImage(tailId, file);
    }
}
