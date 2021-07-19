package iaf.blueflame.services;

import iaf.blueflame.entities.Squad;
import iaf.blueflame.repositories.SquadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SquadService {
    final SquadRepository repository;

    public SquadService(SquadRepository repository) {
        this.repository = repository;
    }

    public List<Squad> getSquads() {
        return repository.findAll();
    }

    public Squad getSquad(long squadId) {
        return repository.findById(squadId).get();
    }

    // public List<Tail> getTails(Long squadId) {return repository.findAll();}

}
