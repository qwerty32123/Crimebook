create table Usuarios
(
    username    varchar(15)  not null
        primary key,
    apellidos   varchar(50)  not null,
    contrasenya varchar(100) not null,
    email       varchar(50)  not null,
    nombre      varchar(50)  not null,
    constraint UK_7siao1h1arues629dbovxn1xb
        unique (email)
);

INSERT INTO crimebook.Usuarios (username, apellidos, contrasenya, email, nombre) VALUES ('enrique', 'asasasas', 'asasasasas', '123123@gmail.com', 'enernenrere');
INSERT INTO crimebook.Usuarios (username, apellidos, contrasenya, email, nombre) VALUES ('ivantapia01', 'ivantapia@email.cb', 'ivan', 'tapia', '1234abcd');
INSERT INTO crimebook.Usuarios (username, apellidos, contrasenya, email, nombre) VALUES ('kiki', 'garcia', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', 'qewqwewq@gmail.com', 'enrique');