CREATE TABLE IF NOT EXISTS teacher (
    employee_number VARCHAR(15) NOT NULL,
    name VARCHAR(100) NOT NULL,
    email_id VARCHAR(100),
    address TEXT,
    contact_number VARCHAR(20),
    class_teacher_of VARCHAR(5),
    salary BIGINT,
    created_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT pk_teacher UNIQUE (employee_number)
);