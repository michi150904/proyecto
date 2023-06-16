<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear</title>
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
            </ul>
        </nav>
    </header>
    <main>
        <h3>Crea un libro</h3>
        <p>Llena el siguiente formulario para empezar a escribir tu libro</p>
        <section class="section">
        <form action="libro" method="post">
            <label for="">Nombre del libro</label>
            <input type="text" name="nombrelib" id="nombrelib" class="controls" placeholder="Nombre del libro" required>
            <label for="">Nombre del autor</label>
            <input type="text" name="nombreaut" id="nombreaut" class="controls" placeholder="Nombre del autor" required>
            <label for="">Categoría</label>
            <input type="text" name="categoria" id="categoria" class="controls" placeholder="Categoría" required>
            <label for="">Género</label>
            <input type="text" name="genero" id="genero" class="controls" placeholder="Género" required>
            <label for="">Fecha de publicación</label>
            <input type="text" name="fechapubli" id="fechapubli" class="controls" placeholder="Fecha de publicación" required>
            <input type="checkbox" name="estado" id="estado" checked >
            <label for="estado"> Activo</label>       
            <input class="buttons" type="submit" name="action" value="Crear">
        </form>
        </section>
        <p>Si quieres volver oprime el siguiente botón
            <a href="general?action=agr-dash"><input class="buttons2" type="submit" name="" value="Volver"></a>
        </p>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>

</body>
</html>