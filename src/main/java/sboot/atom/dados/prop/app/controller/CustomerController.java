package sboot.atom.dados.prop.app.controller;

import br.com.atom.dados.prop.api.V1Api;
import br.com.atom.dados.prop.representation.CustomerRegistrationRequest;
import br.com.atom.dados.prop.representation.CustomerRegistrationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import sboot.atom.dados.prop.app.service.CustomerService;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerController implements V1Api {

    @Autowired
    private CustomerService service;

    @Override
    public ResponseEntity<CustomerRegistrationResponse> postInitialCustomerRegistration(CustomerRegistrationRequest body) {

        try {

            return ResponseEntity.ok(service.registerCustomer(body));
        } catch (Exception e) {
            log.error("Error: ", e);

            return ResponseEntity.status(500).build();
        }
    }
}
