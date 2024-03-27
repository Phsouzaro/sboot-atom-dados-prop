package sboot.atom.dados.prop.app.controller;

import br.com.atom.dados.prop.api.V1Api;
import br.com.atom.dados.prop.representation.CustomerRegistrationRequest;
import br.com.atom.dados.prop.representation.CustomerRegistrationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import sboot.atom.dados.prop.app.service.CustomerService;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerController implements V1Api {

    private final CustomerService service;

    @Override
    public ResponseEntity<CustomerRegistrationResponse> postInitialCustomerRegistration(CustomerRegistrationRequest body) {
        log.info("Initializing customer registration with body {}", body);
        return ResponseEntity.ok(service.registerCustomer(body));
    }
}
