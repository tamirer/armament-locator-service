package iaf.blueflame.services;

import iaf.blueflame.entities.Squad;

import java.util.List;

public interface SquadService {
    List<Squad> getSquads();

    Squad getSquad(long squadId);
}
