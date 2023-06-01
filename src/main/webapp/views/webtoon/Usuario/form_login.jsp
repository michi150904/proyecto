<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Registro</title>
    <link rel="stylesheet" href="assets\webtoon\css\style_header.css">
    <link rel="stylesheet" href="assets\webtoon\css\style_login.css">
    <link rel="stylesheet" href="assets\webtoon\css\style_main.css">
</head>
<body>
    <header>
        <nav>
            <input type="checkbox" id="checkbox">
            <label for="checkbox" class="checkbtn">
                <i class="fas fa-bars"></i>
            </label>
            <a href="" class="enlace"></a>
            <img src="assets\webtoon\img\Naver_Line_Webtoon_logo.png" alt="" class="logo">
            <ul>
                <li><a class="active" href="general?action=loginweb">Iniciar Sesión</a></li>
                <li><a  href="general?action=formlogweb">Registrate</a></li>
                <li><a  href="general?action=inicioprin">Inicio</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section class="form-login2">
            <form action="general" method="post">
                <h5>FORMULARIO DE REGISTRO</h5>
                <input class="controls" type="text" name="nombre" value="" placeholder="Nombres">
                <input class="controls" type="text" name="apellido" value="" placeholder="Apellidos">
                <input class="controls" type="text" name="correo" value="" placeholder="Correo Electronico">
                <input class="controls" type="password" name="contraseña" value="" placeholder="Contraseña">
                <input class="buttons" type="submit" name="action" value="Registrarweb">
            </form>
        </section>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>

</body>
</html>