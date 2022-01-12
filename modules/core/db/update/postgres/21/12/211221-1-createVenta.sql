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
);