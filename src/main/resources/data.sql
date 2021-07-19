DROP TABLE IF EXISTS squads;

CREATE TABLE squads
(
    id   LONG PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

INSERT INTO mission_statuses (id, description)
VALUES (1, 'Preflight');
INSERT INTO mission_statuses (id, description)
VALUES (2, 'AfterPreflightArmaments');
INSERT INTO mission_statuses (id, description)
VALUES (3, 'Sortie');
INSERT INTO mission_statuses (id, description)
VALUES (4, 'AfterFlightArmaments');
INSERT INTO mission_statuses (id, description)
VALUES (5, 'Done');

INSERT INTO squads (id,name) VALUES (1,'069');
INSERT INTO squads (id,name) VALUES (2,'100');
INSERT INTO squads (id,name) VALUES (3,'114');