-- liquibase formatted sql

-- changeset ashikin:1
CREATE TABLE users
(
    id    SERIAL,
    email TEXT
)

-- changeset ashikin:2
ALTER TABLE users
ADD COLUMN name TEXT;

-- changeset ashikin:3
CREATE INDEX users_name_index ON users (name);