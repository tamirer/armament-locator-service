package iaf.blueflame.armamentlocatorservice;

import Entities.Squad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    MyService service;

    @GetMapping("/squads")
    public List<Squad> getSquads(){
        return service.getSquads();
    }

//    @GetMapping("{squadId}/tails")
//    public List<Tail> getSquads(@PathVariable String squadId){
//        return service.getTails(squadId);
//    }
}
