<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
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
                <li><a class="active" href="general?action=inicioweb">Cerrar Sesión</a></li>
                <li><a  href="#biblioteca">biblioteca</a></li>
                <li><a  href="#libro">Libro</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <a name="libro"><section></a>
            <h3>WEBTOONS</h3>
            <p>En esta sección econtraras las acciones que puedes hacer con tus comics</p>
            <h5>¿QUIERES CREAR UN COMIC?</h5>
            <p>Si quieres crear un comic oprime el siguiente botón
            <a href="general?action=comiccrea"><input class="buttons2" type="submit" name="" value="Crear"></a>
            </p>
            <h5>¿QUIERES ELIMINAR UN COMIC?</h5>
            <p>Si quieres eliminar un comic oprime el siguiente botón
            <a href="general?action=comicelim"><input class="buttons2" type="submit" name="" value="Eliminar"></a>
            </p>
        </section>
        <a name="biblioteca"><section></a>
            <h3>BIBLIOTECA</h3>
            <h5>¿QUIERES AGREAGR UN COMIC A BIBLIOTECA?</h5>
            <p>En esta sección econtraras las acciones que puedes hacer con tu biblioteca</p>
            <p>Si quieres agregar un comic oprime el siguiente botón
            <a href="general?action=agregcomic"><input class="buttons2" type="submit" name="" value="Agregar"></a>
            </p>

        </section>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>
   
</body>
</html>