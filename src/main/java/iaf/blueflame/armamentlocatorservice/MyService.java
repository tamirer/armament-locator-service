package iaf.blueflame.armamentlocatorservice;

import Entities.Squad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired MyRepository repository;

    public List<Squad> getSquads() {
        return repository.findAll();
    }

    // public List<Tail> getTails(Long squadId) {return repository.findAll();}

}
