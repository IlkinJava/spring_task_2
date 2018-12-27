CREATE TABLE processors (
  id         SERIAL PRIMARY KEY,
  name       VARCHAR(15),
  version    VARCHAR(15),
  core_count INT,
  frequency  INT
);
CREATE TABLE graphics (
  id      SERIAL PRIMARY KEY,
  name    VARCHAR(15),
  version VARCHAR(15),
  STORAGE INT
);
CREATE TABLE types (
  id          SERIAL PRIMARY KEY,
  name        VARCHAR(15),
  description VARCHAR(100)
);
CREATE TABLE screens (
  id         SERIAL PRIMARY KEY,
  diagonal   DOUBLE PRECISION,
  resolution VARCHAR(20)
);

CREATE TABLE notebooks (
  id            SERIAL PRIMARY KEY,
  name          VARCHAR(20),
  type_id       INT REFERENCES types (id),
  processor_id  INT REFERENCES processors (id),
  year_of_issue VARCHAR(4),
  ram           INT,
  storage       INT,
  screen_id     INT REFERENCES screens (id),
  graphics_id   INT REFERENCES graphics (id),
  price         DOUBLE PRECISION
);