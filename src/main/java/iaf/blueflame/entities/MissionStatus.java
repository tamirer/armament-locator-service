package iaf.blueflame.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mission_statuses")
@Data
public class MissionStatus {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
}
