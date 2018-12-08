DROP TABLE IF EXISTS Company;
create table Company(
id int NOT NULL AUTO_INCREMENT,
comp_name VARCHAR(255),
password VARCHAR(40),
email VARCHAR(255),
PRIMARY KEY(id)
);

DROP TABLE IF EXISTS Customer;
create table Customer(
id int NOT NULL AUTO_INCREMENT,
cust_name VARCHAR(255),
password VARCHAR(40),
PRIMARY KEY(id)
);

DROP TABLE IF EXISTS Coupon;
create table Coupon(
id int NOT NULL AUTO_INCREMENT,
title VARCHAR(255),
start_date DATE,
end_date DATE,
amount INTEGER,
type enum VARCHAR(255),
message VARCHAR(500),
price DOUBLE NOT NULL,
image VARCHAR(255),
PRIMARY KEY(id)
);

DROP TABLE IF EXISTS Customer_Coupon;
create table Customer_Coupon(
cust_id LONG NOT NULL,
coupon_id LONG NOT NULL
);

DROP TABLE IF EXISTS Company_Coupon;
create table Company_Coupon(
comp_id LONG NOT NULL,
comp_id LONG NOT NULL
);

