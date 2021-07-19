package iaf.blueflame.services;

import iaf.blueflame.entities.Tail;
import iaf.blueflame.repositories.TailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TailServiceImpl implements TailService {
    final TailRepository repository;

    public TailServiceImpl(TailRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Tail> getTails() {
        return repository.findAll();
    }

    @Override
    public Tail getTail(long tailId) {
        return repository.findById(tailId).get();
    }
}
