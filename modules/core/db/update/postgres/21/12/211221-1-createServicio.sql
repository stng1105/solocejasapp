create table SOLOCEJASAPP_SERVICIO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODIGO integer not null,
    NOMBRE varchar(255),
    PRECIO bigint,
    PRECIO_SUR integer,
    --
    primary key (ID)
);