<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
        <h3>Mira primero que comic quieres eliminar</h3>
        <tr>
            <th>Id del libro</th>
            <th>Nombre Autor</th>
            <th>Nombre Categoría</th>
            <th>Género del libro</th>
            <th>Fecha de publicación</th>
            <th>Estado</th>
        </tr>
        <c:forEach var="libro" items="${libros}">
        <tr>
            <td>${libro.getId_Libro()}</td>
            <td>${libro.getNombre_Libro()}</td>
            <td>${libro.getAutor()}</td>
            <td>${libro.getCategoria()}</td>
            <td>${libro.getGenero()}</td>
            <td>${libro.getFecha_Publicacion()}</td>
            <td>${libro.getEstado()}</td>
        </tr>
    </c:forEach>
        <p>Llena el siguiente formulario para eliminar tu libro</p>
        <section class="section">
            <form action="libroweb" method="post" id="formEliminarLib">
                <label for="">Id del comic</label>
                <input type="number" class="controls" name="idlibro" id="idlibro">
                <input type="submit" class="buttons" name="action" value="Eliminar">
            </form>
        </section>
            <a href="general?action=dashweb"><input class="buttons2" type="submit" name="" value="Volver"></a>
        </p>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>

</body>
</html>