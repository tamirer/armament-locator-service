package iaf.blueflame.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tails")
@Data
public class Tail {
    @Id
    @GeneratedValue
    Long id;
    String description;
    Long squadId;
    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    MissionStatus missionStatus;
}
