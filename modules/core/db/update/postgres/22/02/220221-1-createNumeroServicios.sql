create table SOLOCEJASAPP_NUMERO_SERVICIOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMERO_SERVICIOS integer,
    --
    primary key (ID)
);