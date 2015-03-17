# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups
create table "ORDERS" ("ID" SERIAL NOT NULL PRIMARY KEY,"CLIENTNAME" VARCHAR(254) DEFAULT '' NOT NULL,"EMAIL" VARCHAR(254) DEFAULT '' NOT NULL,"ADRESS" VARCHAR(254) DEFAULT '' NOT NULL,"PRODUCTID" INT NOT NULL,"ISDILEVERED" BOOLEAN NOT NULL DEFAULT FALSE);
# --- !Downs

drop table "ORDERS";
