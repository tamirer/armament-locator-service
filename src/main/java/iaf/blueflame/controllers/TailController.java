package iaf.blueflame.controllers;

import iaf.blueflame.entities.Squad;
import iaf.blueflame.entities.Tail;
import iaf.blueflame.services.TailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tails")
public class TailController {
    final TailService tailService;

    public TailController(TailService tailService) {
        this.tailService = tailService;
    }

    @GetMapping
    public List<Tail> getTails(){
        return tailService.getTails();
    }

    @GetMapping("{tailId}")
    public Tail getSquad(@PathVariable long tailId){
        return tailService.getTail(tailId);
    }
}
