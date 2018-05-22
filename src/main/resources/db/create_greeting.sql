--liquibase formatted sql

--changeset dreamscale:1
create table greeting (
  id uuid constraint greeting_pk primary key,
  greeting text
)
