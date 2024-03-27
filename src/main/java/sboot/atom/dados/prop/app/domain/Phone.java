package sboot.atom.dados.prop.app.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String areaCode;
    @Column(name = "phone_number")
    private String number;
    @Column(name = "number_extension")
    private String extension;
    @OneToOne(mappedBy = "phone")
    private Customer customer;
}
