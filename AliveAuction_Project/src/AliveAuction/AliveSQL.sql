select * from PRODUCT
select * from MEMBER
select * from BUY


drop table product

delete from product where pro_number= 5

drop table buy

drop table CREDIT

DROP SEQUENCE pro_num_seq

create table MEMBER
(Id varchar2(20), Pw varchar2(20) not null, Name varchar2(20) not null, 
Address varchar2(60) not null,
Age number(5) not null, Tel varchar2(20) not null,
constraint mem_Id_pk primary key(Id))

create table PRODUCT
(Pro_number number(20), 
Sort varchar2(30) not null, 
Id varchar2(20),
Buy_price number(20),
Buy_time varchar(20), 
Start_price number(20) not null, 
Lowest_price number(20) not null,  
Endtime varchar(20) not null, 
Span number(20) not null, 
Gap number(20) not null,  
Day varchar2(20) not null,
Post_name varchar2(100) not null,
Contents varchar2(500) not null,
Link varchar2(100),
State varchar2(20),
constraint product_pro_num_pk primary key(Pro_number), 
constraint product_id_fk foreign key(Id) 
references MEMBER(Id))

create table BUY
(Buy_number number(20), 
 Pro_number number(20), 
Post_number number(20),
Buyer_id varchar2(20), 
Endprice number(20),
Endtime varchar2(20) not null, 
constraint buy_buy_num_pk primary key(Buy_number),
constraint buy_pro_num_fk foreign key(Pro_number)
references PRODUCT(Pro_number),
constraint buy_buyer_id_fk foreign key(Buyer_id)
references MEMBER(Id))

create table CREDIT
(credit_number number(10),
Id varchar2(20), 
 Score number(20), 
Evaluator varchar2(20),
constraint credit_Id_pk primary key(credit_number),
constraint credit_Id_fk foreign key(Id)
references MEMBER(Id),
constraint credit_evaluator_fk foreign key(Evaluator)
references MEMBER(Id))

create sequence pro_num_seq
increment by 1
start with 1
maxvalue 99999
nocache
nocycle

create sequence buy_num_seq
increment by 1
start with 1
maxvalue 99999
nocache
nocycle

create sequence credit_num_seq
increment by 1
start with 1
maxvalue 99999
nocache
nocycle

