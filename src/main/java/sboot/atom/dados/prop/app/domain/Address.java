package sboot.atom.dados.prop.app.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean mailingIndicator;
    private String postalCode;
    private String street;
    private String neighborhood;
    @Column(name = "house_number")
    private String number;
    private String complement;
    private String city;
    @Column(name = "local_state")
    @Enumerated(value = javax.persistence.EnumType.STRING)
    private br.com.atom.dados.prop.representation.Address.StateEnum state;
    @OneToOne(mappedBy = "address")
    private Customer customer;
}
