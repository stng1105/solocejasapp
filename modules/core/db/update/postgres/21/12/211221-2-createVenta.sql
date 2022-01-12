alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_VENDEDORA foreign key (VENDEDORA_ID) references SEC_USER(ID);
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_LOCAL foreign key (LOCAL_ID) references SOLOCEJASAPP_LOCAL(ID);
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_CLIENTE foreign key (CLIENTE_ID) references SOLOCEJASAPP_CLIENTE(ID);
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_FORMA_PAGO foreign key (FORMA_PAGO_ID) references SOLOCEJASAPP_FORMA_PAGO(ID);
create unique index IDX_SOLOCEJASAPP_VENTA_UK_NUMERO_VENTA on SOLOCEJASAPP_VENTA (NUMERO_VENTA) where DELETE_TS is null ;
create index IDX_SOLOCEJASAPP_VENTA_ON_VENDEDORA on SOLOCEJASAPP_VENTA (VENDEDORA_ID);
create index IDX_SOLOCEJASAPP_VENTA_ON_LOCAL on SOLOCEJASAPP_VENTA (LOCAL_ID);
create index IDX_SOLOCEJASAPP_VENTA_ON_CLIENTE on SOLOCEJASAPP_VENTA (CLIENTE_ID);
create index IDX_SOLOCEJASAPP_VENTA_ON_FORMA_PAGO on SOLOCEJASAPP_VENTA (FORMA_PAGO_ID);
