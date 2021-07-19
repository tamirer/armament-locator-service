package iaf.blueflame.controllers;

import iaf.blueflame.entities.Tail;
import iaf.blueflame.entities.TailArmamentImages;
import iaf.blueflame.services.TailArmamentImageService;
import iaf.blueflame.services.TailService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tails")
public class TailController {
    private final TailService tailService;
    private final TailArmamentImageService tailArmamentImageService;

    public TailController(TailService tailService, TailArmamentImageService tailArmamentImageService) {
        this.tailService = tailService;
        this.tailArmamentImageService = tailArmamentImageService;
    }

    @GetMapping
    public List<Tail> getTails() {
        return tailService.getTails();
    }

    @GetMapping("{tailId}")
    public Tail getTail(@PathVariable long tailId) {
        return tailService.getTail(tailId);
    }

    @PostMapping("{tailId}/changeStatus")
    public void changeStatus(@PathVariable long tailId,
                             @RequestParam("status") long statusId) {
        Tail tail = this.getTail(tailId);
        tail.setMissionStatus(tailService.getStatus(statusId));
        this.tailService.updateTailStatus(tail);
    }

    @PostMapping("{tailId}/preflight")
    public TailArmamentImages uploadPreflightImage(@PathVariable long tailId,
                                                   @RequestParam("file") MultipartFile file) throws IOException {
        return this.tailArmamentImageService.uploadPreflightImage(tailId, file);
    }

    @PostMapping("{tailId}/afterflight")
    public TailArmamentImages uploadAfterFlightImage(@PathVariable long tailId,
                                                     @RequestBody MultipartFile file) throws IOException {
        return this.tailArmamentImageService.uploadPostflightImage(tailId, file);
    }

    @GetMapping("{tailId}/afterflight")
    public byte[] getAfterFlightImage(@PathVariable long tailId) {
        return this.tailArmamentImageService.getPostflightImage(tailId);
    }

    @GetMapping("{tailId}/preflight")
    public byte[] getPreflightImage(@PathVariable long tailId) {
        return this.tailArmamentImageService.getPreflightImage(tailId);
    }
}
