create table book(
	id int(11) not null auto_increment,
    cover varchar(50),
    title varchar(50),
    author varchar(50),
    date varchar(50),
    press varchar(50),
    abouts varchar(255),
    cid int(11),
    primary key(id)
    );

create table bookCategory(
	id int(11) not null auto_increment,
    name varchar(50),
    primary key(id)
    );

