CREATE TABLE Users (
ID INT AUTO_INCREMENT ,
Name VARCHAR(15) NOT NULL ,
Surname VARCHAR(25) NOT NULL ,
Email VARCHAR(20) NOT NULL ,
Login VARCHAR(15) NOT NULL ,
Password VARCHAR(20) NOT NULL ,
FK_Role INT(2) NOT NULL,
PRIMARY KEY (ID)
);