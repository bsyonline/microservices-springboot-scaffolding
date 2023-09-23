drop table if exists t_account;
create table t_account (
  id bigint not null primary key auto_increment,
  name varchar(50) not null,
  email varchar(100) not null,
  confirmed_and_active bool,
  member_since timestamp,
  support bool,
  phone_number varchar(20) not null,
  photo_url varchar(300)
);