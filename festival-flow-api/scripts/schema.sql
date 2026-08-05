CREATE TABLE festivals(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL
);

CREATE TABLE stages(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    capacity INT,
    festival_id INT REFERENCES festivals(id)
);