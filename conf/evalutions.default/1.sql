# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "PRODUCTS" ("ID" SERIAL NOT NULL PRIMARY KEY,"NAME" VARCHAR(254) DEFAULT '' NOT NULL,"DESCRIPTION" VARCHAR(254) DEFAULT '' NOT NULL,"IMAGE" VARCHAR(254) DEFAULT 'logo.png' NOT NULL,"PRICE" INT NOT NULL);
INSERT into "PRODUCTS"("NAME", "DESCRIPTION", "IMAGE",  "PRICE") values ('SUPREME','Classic marinara sauce, pepperoni, seasoned pork, beef, fresh mushrooms, fresh green bell peppers and fresh red onions.', 'piz1.png',7000);
INSERT into "PRODUCTS"("NAME", "DESCRIPTION", "IMAGE", "PRICE") values ('MEAT LOVER`S','Classic marinara sauce, pepperoni, Italian sausage, roasted ham, hardwood smoked bacon, seasoned pork and beef.', 'piz2.png',8500);
INSERT into "PRODUCTS"("NAME", "DESCRIPTION", "IMAGE", "PRICE") values ('VEGGIE LOVER`S','Classic marinara sauce, fresh mushrooms, fresh red onions, fresh green bell peppers, Roma tomatoes and black olives.', 'piz3.png',9000);

create table "ORDERS" ("ID" SERIAL NOT NULL PRIMARY KEY,"CLIENTNAME" VARCHAR(254) DEFAULT '' NOT NULL,"EMAIL" VARCHAR(254) DEFAULT '' NOT NULL,"ADRESS" VARCHAR(254) DEFAULT '' NOT NULL,"PRODUCTID" INT NOT NULL,"ISDILEVERED" BOOLEAN NOT NULL DEFAULT FALSE);

# --- !Downs

drop table "PRODUCTS";
drop table "ORDERS";

