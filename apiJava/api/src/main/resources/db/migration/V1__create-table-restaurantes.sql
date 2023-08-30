create table restaurantes(

    id bigint not null auto_increment,
    usuario varchar(100) not null unique,
    senha varchar(100) not null unique,


    primary key(id)

);