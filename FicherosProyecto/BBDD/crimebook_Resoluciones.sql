create table Resoluciones
(
    idPrueba  int                                 not null,
    idEquipo  int                                 not null,
    estrellas enum ('0', '1', '2', '3', '4', '5') null,
    intentos  int                                 not null,
    resuelta  tinyint                             not null,
    primary key (idPrueba, idEquipo)
);

