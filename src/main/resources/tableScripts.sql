create schema ProductService_DB;
use ProductService_DB;
create table product(
prod_id int auto_increment,
prod_name varchar(50) not null,
prod_type varchar(50) not null,
prod_category varchar(50) not null,
prod_price varchar(50) not null,
constraint prod_id_pk primary key (prod_id))