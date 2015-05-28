# Tasks schema

# --- !Ups

CREATE SEQUENCE todoitem_id_seq;
CREATE TABLE todoitem (
    id integer NOT NULL DEFAULT nextval('todoitem_id_seq'),
    note varchar(255)
);

# --- !Downs

DROP TABLE todoitem;
DROP SEQUENCE todoitem_id_seq;
