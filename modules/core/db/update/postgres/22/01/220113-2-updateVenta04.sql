alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO_5 foreign key (SERVICIO_5_ID) references SOLOCEJASAPP_SERVICIO(ID);
create index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO_5 on SOLOCEJASAPP_VENTA (SERVICIO_5_ID);
