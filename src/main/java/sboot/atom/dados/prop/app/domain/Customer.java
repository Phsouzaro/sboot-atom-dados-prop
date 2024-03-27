package sboot.atom.dados.prop.app.domain;


import br.com.atom.dados.prop.representation.CustomerRegistrationRequestCustomer;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cpfNumber;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String rgNumber;
    @Column(name = "full_name")
    private String name;
    private Date dateOfBirth;
    private String mothersName;
    @Enumerated(value = javax.persistence.EnumType.STRING)
    private CustomerRegistrationRequestCustomer.MaritalStatusEnum maritalStatus;
    @Enumerated(value = javax.persistence.EnumType.STRING)
    private CustomerRegistrationRequestCustomer.GenderEnum gender;
    @Enumerated(value = javax.persistence.EnumType.STRING)
    private CustomerRegistrationRequestCustomer.ResidenceTypeEnum residenceType;
    private double propertyValue;
    @Enumerated(value = javax.persistence.EnumType.STRING)
    private CustomerRegistrationRequestCustomer.NationalityEnum nationality;
    private Integer numberOfDependents;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "birthplace_id")
    private BirthPlace birthPlace;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ocupation_id")
    private Ocupation ocupation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phone_id")
    private Phone phone;
}
