create table Equipos
(
    id        int         not null
        primary key,
    codigo    int         not null,
    nombre    varchar(50) not null,
    tiempo    int         not null,
    idPartida int         not null,
    constraint UK_qjd6e6rko0nwudv8n581xm1co
        unique (codigo),
    constraint FK5wirtbsr3g6jajx56xhphgu4a
        foreign key (idPartida) references Partidas (id)
);

