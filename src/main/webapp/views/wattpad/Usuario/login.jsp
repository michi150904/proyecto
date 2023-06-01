<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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
                <li><a class="active" href="general?action=login">Iniciar Sesión</a></li>
                <li><a  href="general?action=registrar">Registrate</a></li>
                <li><a  href="general?action=inicio">Inicio</a></li>
            </ul>
        </nav>
        </header>
    <main>
        <section class="form-login">
            <form action="general" method="post">
                <h5>INICIAR SESIÓN</h5>
                <input class="controls" type="text" name="usuario" value="" placeholder="Usuario" required>
                <input class="controls" type="password" name="contraseña" value="" placeholder="Contraseña" required>
                <input class="buttons" type="submit" name="action" value="Ingresar">
            </form>
        </section>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>
</body>
</html>