package sboot.atom.dados.prop.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sboot.atom.dados.prop.app.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
