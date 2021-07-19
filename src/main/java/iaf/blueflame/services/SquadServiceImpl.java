package iaf.blueflame.services;

import iaf.blueflame.entities.Squad;
import iaf.blueflame.repositories.SquadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SquadServiceImpl implements SquadService {
    final SquadRepository repository;

    public SquadServiceImpl(SquadRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Squad> getSquads() {
        return repository.findAll();
    }

    @Override
    public Squad getSquad(long squadId) {
        return repository.findById(squadId).get();
    }
}
