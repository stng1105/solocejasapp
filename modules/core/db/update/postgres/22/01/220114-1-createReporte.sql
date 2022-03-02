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
);