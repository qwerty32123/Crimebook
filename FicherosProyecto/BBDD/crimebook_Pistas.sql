create table Pistas
(
    idPrueba int           not null,
    id       int           not null,
    intentos int           null,
    texto    varchar(1000) not null,
    tiempo   int           null,
    primary key (idPrueba, id)
);

