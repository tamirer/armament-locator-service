DROP TABLE IF EXISTS squads;

CREATE TABLE squads
(
    id   LONG PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

INSERT INTO squads (id,name) VALUES (1,'069');
INSERT INTO squads (id,name) VALUES (2,'100');
INSERT INTO squads (id,name) VALUES (3,'114');