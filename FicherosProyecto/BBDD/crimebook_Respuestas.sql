create table Respuestas
(
    idPrueba  int          not null,
    id        int          not null,
    respuesta varchar(200) not null,
    primary key (idPrueba, id)
);

INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500001, 'Gina');
INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500002, 'Bomb');
INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500003, 'New York');
INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500004, '22');
INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500005, '6/2');
INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500006, 'Academy St.');
INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500007, 'UN');
INSERT INTO crimebook.Respuestas (idPrueba, id, respuesta) VALUES (400001, 500008, '132');