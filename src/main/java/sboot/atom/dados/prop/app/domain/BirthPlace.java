package sboot.atom.dados.prop.app.domain;

import br.com.atom.dados.prop.representation.Address;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class BirthPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "local_state")
    @Enumerated(EnumType.STRING)
    private Address.StateEnum state;
    private String cityName;
    @OneToOne(mappedBy = "birthPlace")
    private Customer customer;
}
