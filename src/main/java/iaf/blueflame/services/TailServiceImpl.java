package iaf.blueflame.services;

import iaf.blueflame.entities.MissionStatus;
import iaf.blueflame.entities.Tail;
import iaf.blueflame.repositories.MissionStatusRepository;
import iaf.blueflame.repositories.TailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TailServiceImpl implements TailService {
    final TailRepository repository;
    final MissionStatusRepository misionRepository;

    public TailServiceImpl(TailRepository repository,
                           MissionStatusRepository misionRepository) {
        this.repository = repository;
        this.misionRepository = misionRepository;
    }

    @Override
    public List<Tail> getTails() {
        return repository.findAll();
    }

    @Override
    public Tail getTail(long tailId) {
        return repository.findById(tailId).get();
    }

    @Override
    public void updateTailStatus(Tail tail) {
        this.repository.save(tail);
    }

    @Override
    public MissionStatus getStatus(long statusId) {
        return misionRepository.getById(statusId);
    }
}
