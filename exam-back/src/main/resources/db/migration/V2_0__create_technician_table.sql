CREATE TABLE IF NOT EXISTS TECHNICIAN (
    ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    FIRSTNAME VARCHAR(255),
    LASTNAME VARCHAR(255),
    SPECIALITY VARCHAR(255),
    CITY VARCHAR(255),
    SERVICE_ID BIGINT,
    CONSTRAINT TECHNICIAN_PK PRIMARY KEY (ID)
);