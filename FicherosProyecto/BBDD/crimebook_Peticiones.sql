create table Peticiones
(
    idPrueba int not null,
    idPista  int not null,
    idEquipo int not null,
    primary key (idPrueba, idPista, idEquipo)
);

INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400001, 600001);
INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400001, 600002);
INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400001, 600003);
INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400002, 600001);
INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400002, 600003);
INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400002, 600004);
INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400003, 600001);
INSERT INTO crimebook.Peticiones (idPrueba, idPista, idEquipo) VALUES (300001, 400004, 600001);