package iaf.blueflame.services;

import iaf.blueflame.entities.MissionStatus;
import iaf.blueflame.entities.Tail;

import java.util.List;

public interface TailService {
    List<Tail> getTails();

    Tail getTail(long tailId);

    void updateTailStatus(Tail tail);

    MissionStatus getStatus(long statusId);
}
