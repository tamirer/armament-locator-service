package iaf.blueflame.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "squads")
@Data
public class Squad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
}
