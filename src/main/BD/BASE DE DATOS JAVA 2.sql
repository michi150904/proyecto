create database redesSociales2;
use redesSociales2;
create table Usuario(
Id_Usuario tinyint unsigned auto_increment primary key,
Nombre_Usuario varchar (255) not null,
Apellido_Usuario varchar (255) not null,
Correo_Electronico varchar (255) not null,
Clave varchar (255) not null,
Estado enum ("Activo","Inactivo") not null
);
create table Libro (
Id_Libro tinyint unsigned auto_increment primary key,
Nombre_Libro varchar (255) not null,
Nombre_Autor varchar (255) not null,
Categoria varchar (255) not null,
Genero varchar (255) not null,
Fecha_Publicacion varchar (255) not null,
Estado_Libro enum ("Activo","Inactivo") not null
);
create table Usu_Lib(
Id_Usu_Lib tinyint unsigned auto_increment primary key,
Id_lib tinyint unsigned not null,
Id_usu tinyint unsigned not null,
foreign key (Id_usu) references Usuario (Id_Usuario),
foreign key (Id_lib) references Libro (Id_Libro)
);
select * from usuario;
select * from libro;
select Correo_Electronico,Clave,Estado from usuario;
UPDATE libro SET Nombre_Libro="michi",Nombre_Autor="michi",Categoria="michi",Genero="michi",Fecha_Publicacion="michi",Estado_Libro="inactivo" WHERE Id_Libro=2;