--liquibase formatted sql

--changeset dreamscale:1
create table app_user (
  id uuid constraint user_pk primary key,
  api_key text
)
