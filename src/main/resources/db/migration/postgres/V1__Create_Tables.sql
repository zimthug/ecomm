create table products
(
product_id serial not null primary key,
product_name varchar(100) not null,
price numeric(12, 2) not null,
stock_level numeric(5) not null
);