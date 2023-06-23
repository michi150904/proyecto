<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Elimina</title>
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
            </ul>
        </nav>
    </header>
    <main>
        <h3>Eliminar un comic</h3>
        <section class="section">
        <h5>Mira primero que comic quieres eliminar</h5>
        <table class="table">
        <tr>
            <th class="td">Id del libro</th>
            <th class="td">Nombre Autor</th>
            <th class="td">Nombre Categoría</th>
            <th class="td">Género del libro</th>
            <th class="td">Fecha de publicación</th>
            <th class="td">Estado</th>
        </tr>
        <c:forEach var="libro" items="${libros}">
        <tr>
            <td class="td">${libro.getIdLibro()}</td>
            <td class="td">${libro.getNombreLibro()}</td>
            <td class="td">${libro.getAutor()}</td>
            <td class="td">${libro.getCategoria()}</td>
            <td class="td">${libro.getGenero()}</td>
            <td class="td">${libro.getFechaPublicacion()}</td>
            <td class="td">${libro.getEstado()}</td>
        </tr>
    </c:forEach>
</table>
</section>
        <p>Llena el siguiente formulario para eliminar tu libro</p>
        <section class="section">
            <form action="libroweb" method="post" id="formEliminarLib">
                <label for="">Id del comic</label>
                <input type="number" class="controls" name="idlibro" id="idlibro">
                <input type="submit" class="buttons" name="action" value="Eliminar">
            </form>
        </section>
        <p>Si quieres volver oprime el siguiente botón
            <a href="general?action=dashweb"><input class="buttons2" type="submit" name="" value="Volver"></a>
        </p>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>

</body>
</html>