DROP TABLE IF EXISTS tails;
DROP TABLE IF EXISTS squads;
DROP TABLE IF EXISTS mission_statuses;

CREATE TABLE squads
(
    id          integer PRIMARY KEY,
    description VARCHAR(250) NOT NULL
);

INSERT INTO squads (id, description)
VALUES (1, '069');
INSERT INTO squads (id, description)
VALUES (2, '100');
INSERT INTO squads (id, description)
VALUES (3, '114');

CREATE TABLE tails
(
    id             integer PRIMARY KEY,
    description    VARCHAR(250) NOT NULL,
    squad          integer      not null,
    mission_status integer      not null
);

insert into tails (id, description, squad, mission_status)
values (1, '212', 1, 1);
insert into tails (id, description, squad, mission_status)
values (2, '987', 1, 2);
insert into tails (id, description, squad, mission_status)
values (3, '404', 2, 3);
insert into tails (id, description, squad, mission_status)
values ( 4, '210'
       , 1, 4);


CREATE TABLE mission_statuses
(
    id          integer PRIMARY KEY,
    description VARCHAR(250) NOT NULL
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

select *
from tails;
select *
from squads;
select *
from mission_statuses;
