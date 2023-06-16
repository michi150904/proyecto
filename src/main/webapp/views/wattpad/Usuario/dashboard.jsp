<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="assets\wattpad\css\style_header.css">
    <link rel="stylesheet" href="assets\wattpad\css\style_login.css">
    <link rel="stylesheet" href="assets\wattpad\css\style_main.css">
</head>
<body>
    <header>
        <nav>
            <input type="checkbox" id="checkbox">
            <label for="checkbox" class="checkbtn">
                <i class="fas fa-bars"></i>
            </label>
            <a href="" class="enlace"></a>
            <img src="assets\wattpad\img\Wattpad-logo-vector.svg.png" alt="" class="logo">
            <ul>
                <li><a class="active" href="general?action=inicio">Cerrar Sesión</a></li>
                <li><a  href="#biblioteca">biblioteca</a></li>
                <li><a  href="#libro">Libro</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <a name="libro"><section></a>
            <h3>LIBROS</h3>
            <p>En esta sección econtraras las acciones que puedes hacer con tus libros</p>
            <h5>¿QUIERES CREAR UN LIBRO?</h5>
            <p>Si quieres crear un libro oprime el siguiente botón
            <a href="libro?action=lib-cre"><input class="buttons2" type="submit" name="" value="Crear"></a>
            </p>
            <h5>¿QUIERES ELIMINAR UN LIBRO?</h5>
            <p>Si quieres eliminar un libro oprime el siguiente botón
            <a href="libro?action=lib-eli"><input class="buttons2" type="submit" name="" value="Eliminar"></a>
            </p>
            <h5>¿QUIERES ACTUALIZAR UN LIBRO?</h5>
            <p>Si quieres actualizar un libro oprime el siguiente botón
            <a href="libro?action=actu-lib"><input class="buttons2" type="submit" name="" value="Actualizar"></a>
            </p>

        </section>
        <a name="biblioteca"><section></a>
            <h3>BIBLIOTECA</h3>
            <h5>¿QUIERES AGREAGR UN LIBRO A BIBLIOTECA?</h5>
            <p>En esta sección econtraras las acciones que puedes hacer con tu biblioteca</p>
            <p>Si quieres agregar un libro oprime el siguiente botón
            <a href="libro?action=agr-lib"><input class="buttons2" type="submit" name="" value="Agregar"></a>
            </p>

        </section>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>

</body>
</html>