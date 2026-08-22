CREATE TABLE IF NOT EXISTS student (
    roll_number VARCHAR(15) NOT NULL,
    name VARCHAR(100) NOT NULL,
    email_id VARCHAR(100),
    class_section VARCHAR(5),
    father_name VARCHAR(100),
    mother_name VARCHAR(100),
    address TEXT,
    contact_number VARCHAR(20),
    created_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT pk_student UNIQUE (roll_number)
);