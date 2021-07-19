package iaf.blueflame.services;

import iaf.blueflame.entities.Tail;

import java.util.List;

public interface TailService {
    List<Tail> getTails();

    Tail getTail(long tailId);
}
