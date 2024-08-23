create table usuarios (

                          id bigint not null auto_increment,
                          nome varchar(100) not null,
                          telefone varchar(100) not null,
                          email varchar(100) not null,
                          mensagem varchar(100),
                          primary key (id)

);