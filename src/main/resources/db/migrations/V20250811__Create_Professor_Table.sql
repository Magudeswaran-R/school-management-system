create table PROFESSOR (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    date_of_birth DATE,
    gender VARCHAR(3),
    date_of_joining DATE,
    address  TEXT,
    is_active CHAR,
    created_date TIMESTAMP,
    updated_date TIMESTAMP
)