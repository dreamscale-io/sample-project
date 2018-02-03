--liquibase formatted sql

--changeset dreamscale:1
create table crud (
  id uuid constraint crud_pk primary key,
  value text
)
