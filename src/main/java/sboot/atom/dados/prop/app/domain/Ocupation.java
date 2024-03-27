package sboot.atom.dados.prop.app.domain;

import br.com.atom.dados.prop.representation.CustomerRegistrationRequestCustomerOcupation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class Ocupation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employerDocument;
    private String employeeRegistry;
    private Date admissionDate;
    private double netSalary;
    private double consignableMargin;
    @Enumerated(value = javax.persistence.EnumType.STRING)
    private CustomerRegistrationRequestCustomerOcupation.ProfessionEnum profession;
    @OneToOne(mappedBy = "ocupation")
    private Customer customer;
}
