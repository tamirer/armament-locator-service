package iaf.blueflame.armamentlocatorservice;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Tail {
    @Id
    @GeneratedValue
    Long id;
    String name;
    Long squadId;
}
