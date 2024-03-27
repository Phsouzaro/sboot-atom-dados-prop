DROP TABLE IF EXISTS phone;
DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS ocupation;
DROP TABLE IF EXISTS birth_place;
DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    id SERIAL PRIMARY KEY,
    cpf_number VARCHAR(255),
    email VARCHAR(255),
    rg_number VARCHAR(255),
    name VARCHAR(255),
    date_of_birth TIMESTAMP,
    mothers_name VARCHAR(255),
    marital_status VARCHAR(255),
    gender VARCHAR(255),
    residence_type VARCHAR(255),
    property_value DOUBLE PRECISION,
    nationality VARCHAR(255),
    number_of_dependents INTEGER,
    birthplace_id INTEGER,
    ocupation_id INTEGER,
    address_id INTEGER,
    phone_id INTEGER,
    FOREIGN KEY (birthplace_id) REFERENCES birth_place(id),
    FOREIGN KEY (ocupation_id) REFERENCES ocupation(id),
    FOREIGN KEY (address_id) REFERENCES address(id),
    FOREIGN KEY (phone_id) REFERENCES phone(id)
);

CREATE TABLE phone (
    id SERIAL PRIMARY KEY,
    area_code VARCHAR(255),
    number VARCHAR(255),
    extension VARCHAR(255),
    customer_id INTEGER,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE address (
    id SERIAL PRIMARY KEY,
    mailing_indicator BOOLEAN,
    postal_code VARCHAR(255),
    street VARCHAR(255),
    neighborhood VARCHAR(255),
    number VARCHAR(255),
    complement VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    customer_id INTEGER,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE ocupation (
    id SERIAL PRIMARY KEY,
    employer_document VARCHAR(255),
    employee_registry VARCHAR(255),
    admission_date TIMESTAMP,
    net_salary DOUBLE PRECISION,
    consignable_margin DOUBLE PRECISION,
    profession VARCHAR(255),
    customer_id INTEGER,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE birth_place (
    id SERIAL PRIMARY KEY,
    state VARCHAR(255),
    city_name VARCHAR(255),
    customer_id INTEGER,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
