alter table SOLOCEJASAPP_LOCAL add column SUR boolean ;
-- update SOLOCEJASAPP_LOCAL set SEDE = <default_value> where SEDE is null ;
alter table SOLOCEJASAPP_LOCAL alter column SEDE set not null ;
