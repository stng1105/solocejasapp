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
    LOCAL_ID uuid not null,
    CLIENTE_ID uuid,
    DINERO bigint not null,
    FORMA_PAGO_ID uuid,
    CANTIDAD_SERVICIOS integer,
    SERVICIO_ID uuid,
    SERVICIO_2_ID uuid,
    SERVICIO_3_ID uuid,
    SERVICIO_4_ID uuid,
    SERVICIO_5_ID uuid,
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
-- begin SOLOCEJASAPP_REPORTE
create table SOLOCEJASAPP_REPORTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FECHA date,
    VENDEDORA_ID uuid,
    LOCAL_ID uuid,
    NUMERO_SERVICIOS integer,
    DINERO_VENTAS bigint,
    PESTANAS integer,
    ACEITES integer,
    NOMINA bigint,
    SEMANA integer,
    --
    primary key (ID)
)^
-- end SOLOCEJASAPP_REPORTE
-- begin SOLOCEJASAPP_SEMANA
create table SOLOCEJASAPP_SEMANA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMERO_SEMANA integer,
    INICIO timestamp,
    FIN timestamp,
    --
    primary key (ID)
)^
-- end SOLOCEJASAPP_SEMANA
-- begin SOLOCEJASAPP_NUMERO_SERVICIOS
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
)^
-- end SOLOCEJASAPP_NUMERO_SERVICIOS
