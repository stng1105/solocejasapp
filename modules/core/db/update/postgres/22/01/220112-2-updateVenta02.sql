alter table SOLOCEJASAPP_VENTA rename column servicio_1_id to servicio_1_id__u09175 ;
alter table SOLOCEJASAPP_VENTA drop constraint FK_SOLOCEJASAPP_VENTA_ON_SERVICIO_1 ;
drop index IDX_SOLOCEJASAPP_VENTA_ON_SERVICIO_1 ;
alter table SOLOCEJASAPP_VENTA add column SERVICIO_ID uuid ;
