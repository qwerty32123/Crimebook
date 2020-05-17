create table Pruebas
(
    id            int           not null
        primary key,
    ayudaFinal    varchar(200)  null,
    descBreve     varchar(1000) null,
    descExtendida varchar(1000) null,
    dificultad    varchar(30)   null,
    nombre        varchar(50)   not null,
    tipo          varchar(300)  not null,
    url           varchar(100)  null,
    username      varchar(15)   not null,
    constraint UK_p1j3i8ch3s6diym37bc4o3q58
        unique (nombre),
    constraint FKjbwhycykmudis1rf9ciy1v815
        foreign key (username) references Usuarios (username)
);

INSERT INTO crimebook.Pruebas (id, ayudaFinal, descBreve, descExtendida, dificultad, nombre, tipo, url, username) VALUES (400001, 'null', 'El Enigma de la Luz', 'Esta es una descripcion muy larga de 
la prueba 1 de Los Asesinos del Crimebook. En realidad no contiene nada
de interes. Solo es texto lorem ipsum para rellenar espacio y asi poder testar
el campo descripcion extendida de las Pruebas. Y ahora voy a repetirlo de nuevo:
Esta es una descripcion muy larga de la prueba 1 de Los Asesinos del Crimebook. 
En realidad no contiene nada de interes. Solo es texto lorem ipsum para rellenar 
espacio y asi poder testar el campo descripcion extendida de las Pruebas. Y ahora 
voy a repetirlo de nuevo:', 'facil', 'La llave de la luz protege su nombre', '1', 'www.google.com', 'ivantapia01');