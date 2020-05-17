create table Partidas
(
    id            int         not null
        primary key,
    duracion      int         not null,
    fechaCreacion timestamp   not null,
    fechaInicio   timestamp   not null,
    nombre        varchar(50) not null,
    idJuego       int         not null,
    username      varchar(15) not null,
    constraint UK_dp8gochty6f0ecjvyajt7yito
        unique (nombre),
    constraint FKkg35niglp93c062miapcy3h0j
        foreign key (idJuego) references Juegos (id),
    constraint FKlhbkik60gkviax16er6iwn044
        foreign key (username) references Usuarios (username)
);

INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1, 0, '2020-05-11 00:00:00', '2020-05-11 00:00:00', 'Partida1', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (2, 0, '2020-05-11 00:00:00', '2020-05-11 00:00:00', 'Partida2', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (3, 0, '2020-05-11 00:00:00', '2020-05-11 00:00:00', 'Partida3', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (4, 0, '2020-05-11 00:00:00', '2020-05-11 00:00:00', 'Partida4', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (15, 0, '2020-05-13 00:00:00', '2020-05-13 00:00:00', 'Partida15', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (16, 0, '2020-05-13 00:00:00', '2020-05-13 00:00:00', 'Partida16', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (17, 0, '2020-05-13 00:00:00', '2020-05-13 00:00:00', 'Partida17', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (18, 0, '2020-05-13 00:00:00', '2020-05-13 00:00:00', 'Partida18', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (25, 0, '2020-05-11 00:00:00', '2020-05-11 00:00:00', 'Partida25', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (68, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida68', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (88, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida88', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (98, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida98', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (100, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida100', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (101, 0, '2020-05-13 00:00:00', '2020-05-13 00:00:00', 'Partida101', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (112, 0, '2020-05-13 00:00:00', '2020-05-13 00:00:00', 'Partida112', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (116, 0, '2020-05-11 00:00:00', '2020-05-11 00:00:00', 'cualquieradaiwa', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (125, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida125', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1212, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida1212', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1221, 0, '2020-05-13 20:21:52', '2020-05-13 20:21:52', 'Partida1221', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1255, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida1255', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (2525, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida2525', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (3952, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida3952', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (6876, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida6876', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (13131, 0, '2020-05-13 21:21:22', '2020-05-13 21:21:22', 'Partida13131', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (24123, 0, '2020-05-13 21:01:27', '2020-05-13 21:01:27', 'Partida24123', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (25255, 0, '2020-05-13 20:28:28', '2020-05-13 20:28:28', 'Partida25255', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (41411, 0, '2020-05-14 14:42:47', '2020-05-14 14:42:47', 'Partida41411', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (98989, 0, '2020-05-14 15:47:33', '2020-05-14 15:47:33', 'Partida98989', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (123131, 0, '2020-05-13 21:21:16', '2020-05-13 21:21:16', 'Partida123131', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (252525, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida252525', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (321123, 0, '2020-05-13 21:20:28', '2020-05-13 21:20:28', 'Partida321123', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (989898, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida989898', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1231231, 0, '2020-05-14 15:14:20', '2020-05-14 15:14:20', 'Partida1231231', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1231541, 0, '2020-05-13 21:15:16', '2020-05-13 21:15:16', 'Partida1231541', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1892312, 0, '2020-05-14 15:46:28', '2020-05-14 15:46:28', 'Partida1892312', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (2412333, 0, '2020-05-13 21:01:58', '2020-05-13 21:01:58', 'Partida2412333', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (4112421, 0, '2020-05-14 20:47:03', '2020-05-14 20:47:03', 'Partida4112421', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (5123123, 0, '2020-05-14 15:35:28', '2020-05-14 15:35:28', 'Partida5123123', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (9128241, 0, '2020-05-14 15:14:25', '2020-05-14 15:14:25', 'Partida9128241', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (12121212, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida12121212', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (12122112, 0, '2020-05-13 21:01:14', '2020-05-13 21:01:14', 'Partida12122112', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (12312321, 0, '2020-05-13 23:10:56', '2020-05-13 23:10:56', 'Partida12312321', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (12512312, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida12512312', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (21312321, 0, '2020-05-14 14:38:24', '2020-05-14 14:38:24', 'Partida21312321', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (90912378, 0, '2020-05-13 21:53:31', '2020-05-13 21:53:31', 'Partida90912378', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (121211212, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida121211212', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (123123131, 0, '2020-05-14 15:43:56', '2020-05-14 15:43:56', 'Partida123123131', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (123131321, 0, '2020-05-14 15:35:08', '2020-05-14 15:35:08', 'Partida123131321', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (125152512, 0, '2020-05-12 00:00:00', '2020-05-12 00:00:00', 'Partida125152512', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (241233344, 0, '2020-05-13 21:12:57', '2020-05-13 21:12:57', 'Partida241233344', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (321312312, 0, '2020-05-13 21:39:26', '2020-05-13 21:39:26', 'Partida321312312', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (321321321, 0, '2020-05-13 23:11:00', '2020-05-13 23:11:00', 'Partida321321321', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (928398123, 0, '2020-05-13 20:37:59', '2020-05-13 20:37:59', 'Partida928398123', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (988978796, 0, '2020-05-14 12:53:27', '2020-05-14 12:53:27', 'Partida988978796', 115, 'enrique');
INSERT INTO crimebook.Partidas (id, duracion, fechaCreacion, fechaInicio, nombre, idJuego, username) VALUES (1234567890, 0, '2020-05-14 12:52:15', '2020-05-14 12:52:15', 'Partida1234567890', 115, 'enrique');