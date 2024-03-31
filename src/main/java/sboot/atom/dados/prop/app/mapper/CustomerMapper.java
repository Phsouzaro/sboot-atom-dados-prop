package sboot.atom.dados.prop.app.mapper;

import br.com.atom.dados.prop.representation.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sboot.atom.dados.prop.app.domain.Customer;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "cpfNumber", source = "customer.cpfNumber")
    @Mapping(target = "email", source = "customer.email")
    @Mapping(target = "rgNumber", source = "customer.rgNumber")
    @Mapping(target = "name", source = "customer.name")
    @Mapping(target = "dateOfBirth", source = "customer.dateOfBirth")
    @Mapping(target = "mothersName", source = "customer.mothersName")
    @Mapping(target = "maritalStatus", source = "customer.maritalStatus")
    @Mapping(target = "gender", source = "customer.gender")
    @Mapping(target = "residenceType", source = "customer.residenceType")
    @Mapping(target = "propertyValue", source = "customer.propertyValue")
    @Mapping(target = "nationality", source = "customer.nationality")
    @Mapping(target = "numberOfDependents", source = "customer.numberOfDependents")
    @Mapping(target = "birthPlace", source = "customer.birthPlace")
    @Mapping(target = "ocupation", source = "customer.ocupation")
    @Mapping(target = "address", source = "customer.address")
    @Mapping(target = "phone", source = "customer.phone")
    Customer toCustomer(CustomerRegistrationRequestCustomer customer);

    CustomerRegistrationResponse toCustomerRegistrationResponse(Long clientId);

    CustomerInfoResponse toCustomerInfoResponse(Customer customer);

    @Mapping(target = "content", source = "customersInfoPage.content")
    PageableCustomerResponse toPageableCustomerResponse(Page<CustomerInfoResponse> customersInfoPage);

    PageableResponse toPageableResponse(Pageable pageable);
}
