drop table if exists user;
create table user(
  user_id integer(5),
  email varchar(50),
  username varchar(30),
  password varchar(30),
  primary key (user_id)
);

drop table if exists post;
create table post(
  post_id integer(5),
  post_date datetime,
  posted_by varchar(30),
  subject varchar(100),
  content varchar(512),
  path varchar(100),
  primary key (post_id)
);

insert into user values(
  1,
  "root@something.io",
  "root",
  "root"
);

insert into user values(
  2,
  "mohamedsamatar100@gmail.com",
  "msamatar0",
  "Mohamed1995"
);

insert into post values(
  1,
  now(),
  "root",
  "The First Post ever Made, Ever",
  "hi",
  1
);