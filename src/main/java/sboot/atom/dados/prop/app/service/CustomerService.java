package sboot.atom.dados.prop.app.service;

import br.com.atom.dados.prop.representation.CustomerRegistrationRequest;
import br.com.atom.dados.prop.representation.CustomerRegistrationResponse;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sboot.atom.dados.prop.app.domain.Customer;
import sboot.atom.dados.prop.app.mapper.CustomerMapper;
import sboot.atom.dados.prop.app.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    public CustomerRegistrationResponse registerCustomer(CustomerRegistrationRequest body) {

        log.info("Registering customer: {}", new Gson().toJson(body));

        Customer customerDomain = customerMapper.toCustomer(body.getCustomer());

        return null;
    }
}
