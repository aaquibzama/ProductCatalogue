create table if not exists product_details (
    product_id integer not null,
    product_name varchar(255),
    product_type varchar(255),
    primary key (productID)
);

insert into product_details values (21, 'tshirt', 'fashion');
insert into product_details values (22, 'shirt', 'fashion');
insert into product_details values (23, 'trousers', 'fashion');
insert into product_details values (24, 'jeans', 'fashion');
insert into product_details values (25, 'cargo', 'fashion');
insert into product_details values (26, 'floaters', 'fashion');
insert into product_details values (27, 'loafers', 'fashion');
insert into product_details values (28, 'shoes', 'fashion');
insert into product_details values (29, 'sandals', 'fashion');
insert into product_details values (30, 'kurta', 'fashion');
insert into product_details values (31, 'shorts', 'fashion');
