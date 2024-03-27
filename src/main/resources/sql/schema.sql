DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS birth_place;
DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS ocupation;
DROP TABLE IF EXISTS phone;

CREATE TABLE birth_place (
    id BIGSERIAL PRIMARY KEY,
    local_state VARCHAR(255),
    city_name VARCHAR(255)
);

CREATE TABLE ocupation (
    id BIGSERIAL PRIMARY KEY,
    employer_document VARCHAR(255),
    employee_registry VARCHAR(255),
    admission_date TIMESTAMP,
    net_salary DOUBLE PRECISION,
    consignable_margin DOUBLE PRECISION,
    profession VARCHAR(255)
);

CREATE TABLE address (
    id BIGSERIAL PRIMARY KEY,
    mailing_indicator BOOLEAN,
    postal_code VARCHAR(255),
    street VARCHAR(255),
    neighborhood VARCHAR(255),
    house_number VARCHAR(255),
    complement VARCHAR(255),
    city VARCHAR(255),
    local_state VARCHAR(255)
);

CREATE TABLE phone (
    id BIGSERIAL PRIMARY KEY,
    area_code VARCHAR(255),
    phone_number VARCHAR(255),
    number_extension VARCHAR(255)
);

CREATE TABLE customer (
    id BIGSERIAL PRIMARY KEY,
    cpf_number VARCHAR(255) UNIQUE,
    email VARCHAR(255) UNIQUE,
    rg_number VARCHAR(255) UNIQUE,
    full_name VARCHAR(255),
    date_of_birth TIMESTAMP,
    mothers_name VARCHAR(255),
    marital_status VARCHAR(255),
    gender VARCHAR(255),
    residence_type VARCHAR(255),
    property_value DOUBLE PRECISION,
    nationality VARCHAR(255),
    number_of_dependents INTEGER,
    birthplace_id BIGINT,
    ocupation_id BIGINT,
    address_id BIGINT,
    phone_id BIGINT,
    FOREIGN KEY (birthplace_id) REFERENCES birth_place(id),
    FOREIGN KEY (ocupation_id) REFERENCES ocupation(id),
    FOREIGN KEY (address_id) REFERENCES address(id),
    FOREIGN KEY (phone_id) REFERENCES phone(id)
);