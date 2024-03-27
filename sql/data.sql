-- Inserindo dados na tabela birth_place
INSERT INTO birth_place (state, city_name) VALUES ('SP', 'São Paulo');
INSERT INTO birth_place (state, city_name) VALUES ('RJ', 'Rio de Janeiro');

-- Inserindo dados na tabela address
INSERT INTO address (mailing_indicator, postal_code, street, neighborhood, number, complement, city, state, customer_id) VALUES (TRUE, '01000-000', 'Rua Exemplo', 'Bairro Exemplo', '123', 'Complemento Exemplo', 'São Paulo', 'SP', 1);
INSERT INTO address (mailing_indicator, postal_code, street, neighborhood, number, complement, city, state, customer_id) VALUES (TRUE, '22041-000', 'Avenida Exemplo', 'Bairro Exemplo', '456', 'Complemento Exemplo', 'Rio de Janeiro', 'RJ', 2);

-- Inserindo dados na tabela phone
INSERT INTO phone (area_code, number, extension, customer_id) VALUES ('11', '1234-5678', '100', 1);
INSERT INTO phone (area_code, number, extension, customer_id) VALUES ('21', '9876-5432', '200', 2);

-- Inserindo dados na tabela ocupation
INSERT INTO ocupation (employer_document, employee_registry, admission_date, net_salary, consignable_margin, profession, customer_id) VALUES ('12345678901234', '123456789', '2024-01-01', 5000.00, 1000.00, 'Engenheiro', 1);
INSERT INTO ocupation (employer_document, employee_registry, admission_date, net_salary, consignable_margin, profession, customer_id) VALUES ('98765432109876', '987654321', '2024-02-01', 6000.00, 1500.00, 'Médico', 2);

-- Inserindo dados na tabela customer
INSERT INTO customer (cpf_number, email, rg_number, name, date_of_birth, mothers_name, marital_status, gender, residence_type, property_value, nationality, number_of_dependents, birthplace_id, ocupation_id, address_id, phone_id) VALUES ('12345678901', 'cliente1@email.com', '123456789', 'João Silva', '1980-01-01', 'Maria Silva', 'Casado', 'Masculino', 'Casa', 500000.00, 'Brasileiro', 2, 1, 1, 1, 1);
INSERT INTO customer (cpf_number, email, rg_number, name, date_of_birth, mothers_name, marital_status, gender, residence_type, property_value, nationality, number_of_dependents, birthplace_id, ocupation_id, address_id, phone_id) VALUES ('98765432109876', 'cliente2@email.com', '987654321', 'Maria Santos', '1985-02-02', 'Ana Santos', 'Solteira', 'Feminino', 'Apartamento', 300000.00, 'Brasileira', 1, 2, 2, 2, 2);
