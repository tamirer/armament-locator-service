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
    @ManyToOne
    @JoinColumn(name = "squad", nullable = false)
    Squad squad;
    @OneToOne
    @JoinColumn(name = "missionStatus", nullable = false)
    MissionStatus missionStatus;
}
