CREATE TABLE IF NOT EXISTS vote (
    id serial NOT NULL  PRIMARY KEY,
    animal_name varchar(20),
    votes_number int
);