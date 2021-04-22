DROP TABLE station IF EXISTS;

CREATE TABLE station  (
    station_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    station_name VARCHAR(256),
    province CHAR(2),
    record_date DATE,
    mean_temp FLOAT,
    highest_temp FLOAT,
    lowest_temp FLOAT
);