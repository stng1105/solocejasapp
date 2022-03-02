-- begin SOLOCEJASAPP_LOCAL
create unique index IDX_SOLOCEJASAPP_LOCAL_UK_SEDE on SOLOCEJASAPP_LOCAL (SEDE) where DELETE_TS is null ^
-- end SOLOCEJASAPP_LOCAL
-- begin SOLOCEJASAPP_SERVICIO
create unique index IDX_SOLOCEJASAPP_SERVICIO_UK_CODIGO on SOLOCEJASAPP_SERVICIO (CODIGO) where DELETE_TS is null ^
-- end SOLOCEJASAPP_SERVICIO
-- begin SOLOCEJASAPP_VENTA
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_VENDEDORA foreign key (VENDEDORA_ID) references SEC_USER(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_LOCAL foreign key (LOCAL_ID) references SOLOCEJASAPP_LOCAL(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_CLIENTE foreign key (CLIENTE_ID) references SOLOCEJASAPP_CLIENTE(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_FORMA_PAGO foreign key (FORMA_PAGO_ID) references SOLOCEJASAPP_FORMA_PAGO(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO foreign key (SERVICIO_ID) references SOLOCEJASAPP_SERVICIO(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO_2 foreign key (SERVICIO_2_ID) references SOLOCEJASAPP_SERVICIO(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO_3 foreign key (SERVICIO_3_ID) references SOLOCEJASAPP_SERVICIO(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO_4 foreign key (SERVICIO_4_ID) references SOLOCEJASAPP_SERVICIO(ID)^
alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO_5 foreign key (SERVICIO_5_ID) references SOLOCEJASAPP_SERVICIO(ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_VENDEDORA on SOLOCEJASAPP_VENTA (VENDEDORA_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_LOCAL on SOLOCEJASAPP_VENTA (LOCAL_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_CLIENTE on SOLOCEJASAPP_VENTA (CLIENTE_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_FORMA_PAGO on SOLOCEJASAPP_VENTA (FORMA_PAGO_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO on SOLOCEJASAPP_VENTA (SERVICIO_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO_2 on SOLOCEJASAPP_VENTA (SERVICIO_2_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO_3 on SOLOCEJASAPP_VENTA (SERVICIO_3_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO_4 on SOLOCEJASAPP_VENTA (SERVICIO_4_ID)^
create index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO_5 on SOLOCEJASAPP_VENTA (SERVICIO_5_ID)^
-- end SOLOCEJASAPP_VENTA
-- begin SOLOCEJASAPP_CLIENTE
create unique index IDX_SOLOCEJASAPP_CLIENTE_UK_IDENTIFICACION on SOLOCEJASAPP_CLIENTE (IDENTIFICACION) where DELETE_TS is null ^
-- end SOLOCEJASAPP_CLIENTE
-- begin SOLOCEJASAPP_REPORTE
alter table SOLOCEJASAPP_REPORTE add constraint FK_SOLOCEJASAPP_REPORTE_ON_VENDEDORA foreign key (VENDEDORA_ID) references SEC_USER(ID)^
alter table SOLOCEJASAPP_REPORTE add constraint FK_SOLOCEJASAPP_REPORTE_ON_LOCAL foreign key (LOCAL_ID) references SOLOCEJASAPP_LOCAL(ID)^
create index IDX_SOLOCEJASAPP_REPORTE_ON_VENDEDORA on SOLOCEJASAPP_REPORTE (VENDEDORA_ID)^
create index IDX_SOLOCEJASAPP_REPORTE_ON_LOCAL on SOLOCEJASAPP_REPORTE (LOCAL_ID)^
-- end SOLOCEJASAPP_REPORTE
