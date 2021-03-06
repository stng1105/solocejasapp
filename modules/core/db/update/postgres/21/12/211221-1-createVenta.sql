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
    CANTIDAD_SERVICIOS integer
    SERVICIO_ID uuid,
    SERVICIO_2_ID uuid,
    SERVICIO_3_ID uuid,
    SERVICIO_4_ID uuid,
    SERVICIO_5_ID uuid,
    --
    primary key (ID)
);