package iaf.blueflame.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "tail_armament_images")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TailArmamentImages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id")
    private Tail tail;

    @Lob
    @Column(name = "preflight_image")
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] preflightImage;

    @Lob
    @Column(name = "after_flight_image")
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] afterFlightImage;

}
