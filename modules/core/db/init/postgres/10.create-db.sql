-- begin SOLOCEJASAPP_LOCAL
create table SOLOCEJASAPP_LOCAL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SEDE varchar(255) not null,
    SUR boolean,
    --
    primary key (ID)
)^
-- end SOLOCEJASAPP_LOCAL
-- begin SOLOCEJASAPP_SERVICIO
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
)^
-- end SOLOCEJASAPP_SERVICIO
-- begin SOLOCEJASAPP_VENTA
create table SOLOCEJASAPP_VENTA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMERO_VENTA integer,
    FECHA date,
    VENDEDORA_ID uuid,
    LOCAL_ID uuid,
    CLIENTE_ID uuid,
    DINERO bigint,
    FORMA_PAGO_ID uuid,
    --
    primary key (ID)
)^
-- end SOLOCEJASAPP_VENTA
-- begin SOLOCEJASAPP_CLIENTE
create table SOLOCEJASAPP_CLIENTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    IDENTIFICACION varchar(255) not null,
    NOMBRE varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end SOLOCEJASAPP_CLIENTE
-- begin SOLOCEJASAPP_FORMA_PAGO
create table SOLOCEJASAPP_FORMA_PAGO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIPO varchar(255),
    --
    primary key (ID)
)^
-- end SOLOCEJASAPP_FORMA_PAGO
