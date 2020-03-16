DROP TABLE IF EXISTS friends;

CREATE TABLE friends (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age int(20) DEFAULT NULL,
  married bit(1) DEFAULT NULL
);

INSERT INTO friends (first_name, last_name) VALUES
  ('Aliko', 'Dangote'),
  ('Folrunsho', 'Alakija');