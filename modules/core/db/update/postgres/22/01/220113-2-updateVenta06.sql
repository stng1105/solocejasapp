alter table SOLOCEJASAPP_VENTA add constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO_4 foreign key (SERVICIO_4_ID) references SOLOCEJASAPP_SERVICIO(ID);
create index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO_4 on SOLOCEJASAPP_VENTA (SERVICIO_4_ID);