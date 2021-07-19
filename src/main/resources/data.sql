DROP TABLE IF EXISTS squads;

CREATE TABLE squads (
                              id Long AUTO_INCREMENT PRIMARY KEY,
                              name VARCHAR(250) NOT NULL
);

INSERT INTO squads (name) VALUES
('069'),
('100'),
('114');