package iaf.blueflame.controllers;

import iaf.blueflame.entities.Squad;
import iaf.blueflame.services.SquadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/squads")
public class SquadController {
    private final SquadService squadService;

    public SquadController(SquadService squadService) {
        this.squadService = squadService;
    }

    @GetMapping
    public List<Squad> getSquads() {
        return squadService.getSquads();
    }

    @GetMapping("{squadId}")
    public Squad getSquad(@PathVariable long squadId) {
        return squadService.getSquad(squadId);
    }
}
