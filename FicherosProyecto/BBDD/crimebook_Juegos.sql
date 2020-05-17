create table Juegos
(
    id            int           not null
        primary key,
    descBreve     varchar(200)  null,
    descExtendida varchar(1000) null,
    fechaCreacion date          not null,
    nombre        varchar(50)   not null,
    username      varchar(15)   not null,
    constraint UK_8628njvjkx4cgn541v9qs4fhe
        unique (nombre),
    constraint FKcpus1lyxipt9a1d0nml8rfmye
        foreign key (username) references Usuarios (username)
);

INSERT INTO crimebook.Juegos (id, descBreve, descExtendida, fechaCreacion, nombre, username) VALUES (115, 'qwewqeqwe', 'qweqweqweqw', '2020-05-15', 'qweewqqewqwe', 'enrique');