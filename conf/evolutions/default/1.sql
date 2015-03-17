# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "PRODUCTS" ("ID" SERIAL NOT NULL PRIMARY KEY,"NAME" VARCHAR(254) DEFAULT '' NOT NULL,"DESCRIPTION" VARCHAR(254) DEFAULT '' NOT NULL,"IMAGE" VARCHAR(254) DEFAULT 'logo.png' NOT NULL,"PRICE" INTEGER DEFAULT 0 NOT NULL);

# --- !Downs

drop table "PRODUCTS";

