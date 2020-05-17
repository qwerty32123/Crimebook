create table Informacion
(
    idCrimebook varchar(255) not null
        primary key,
    `Desc`      varchar(255) null
);

INSERT INTO crimebook.Informacion (idCrimebook, `Desc`) VALUES ('1', 'El juego “Escape Book” consiste en la resolución de diferentes acertijos los cuales nos sirven para desactivar unarrollo del juega bomba en un tiempo determinado. ');