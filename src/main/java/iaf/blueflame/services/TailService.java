package iaf.blueflame.services;

import iaf.blueflame.entities.Tail;
import iaf.blueflame.repositories.TailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TailService {
    final TailRepository repository;

    public TailService(TailRepository repository) {
        this.repository = repository;
    }

    public List<Tail> getTails() {
        return repository.findAll();
    }

    public Tail getTail(long tailId) {
        return repository.findById(tailId).get();
    }
}
