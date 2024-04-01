package sboot.atom.dados.prop.app.service;

import br.com.atom.dados.prop.representation.CustomerInfoResponse;
import br.com.atom.dados.prop.representation.CustomerRegistrationRequest;
import br.com.atom.dados.prop.representation.CustomerRegistrationResponse;
import br.com.atom.dados.prop.representation.PageableCustomerResponse;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sboot.atom.dados.prop.app.domain.Customer;
import sboot.atom.dados.prop.app.exception.ErroTecnicoException;
import sboot.atom.dados.prop.app.mapper.CustomerMapper;
import sboot.atom.dados.prop.app.repository.CustomerRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    @Transactional
    public CustomerRegistrationResponse registerCustomer(CustomerRegistrationRequest body) {

        try {
            log.info("Registering customer: {}", new Gson().toJson(body));
            Customer customerDomain = customerMapper.toCustomer(body.getCustomer());

            Customer savedCustomer = customerRepository.save(customerDomain);
            log.info("Customer registered: {}", new Gson().toJson(savedCustomer));

            return customerMapper.toCustomerRegistrationResponse(savedCustomer.getId());
        } catch (Exception e) {
            log.error("Error: ", e);
            throw new ErroTecnicoException(String.format("Error registering customer: %s", e.getMessage()), e);
        }
    }

    public PageableCustomerResponse getPaginatedCustomers(Integer page, Integer limit) {

        try {
            log.info("Getting paginated customers with page {} and limit {}", page, limit);
            Pageable pageable = PageRequest.of(page, limit);
            Page<Customer> customersPage = customerRepository.findAll(pageable);
            Page<CustomerInfoResponse> customersInfoPage = customersPage.map(customerMapper::toCustomerInfoResponse);

            return customerMapper.toPageableCustomerResponse(customersInfoPage);
        } catch (Exception e) {
            log.error("Error: ", e);
            throw new ErroTecnicoException(String.format("Error getting paginated customers: %s", e.getMessage()), e);
        }
    }
}
