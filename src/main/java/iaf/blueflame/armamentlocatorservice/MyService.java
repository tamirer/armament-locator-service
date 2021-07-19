package iaf.blueflame.armamentlocatorservice;

import iaf.blueflame.entities.Squad;
import iaf.blueflame.repositories.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    MyRepository repository;

    public List<Squad> getSquads() {
        return repository.findAll();
    }

    // public List<Tail> getTails(Long squadId) {return repository.findAll();}

}
