<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Web-Wat</title>
    <link rel="stylesheet" href="assets/css/web-wat.css">
</head>
<body>
    <header>
        <nav>
            <input type="checkbox" id="checkbox">
            <label for="checkbox" class="checkbtn">
                <i class="fas fa-bars"></i>
            </label>
            <a href="" class="enlace"></a>
            <ul>
                <li><a class="active" href="general?action=inicio">Wattpad</a></li>
                <li><a  href="general?action=inicioweb">Webtoon</a></li>
            </ul>
        </nav>    
    </header>
    <main>
        <div>
            <section class="secw">
                <img src="assets/img/Wattpad-logo-vector.svg.png" alt="" class="logo">
                <h5>¿QUÉ ES WATTPAD?</h5>
                <p>Wattpad es una plataforma de lectura social en línea que rompe las barreras entre lectores y escritores. Alienta a los usuarios a crear y compartir sus propias historias en todos los géneros, desde ficción para adolescentes hasta poesía, acción, aventuras y más.</p>
                <p>Creado en Canadá en 2006, las historias de Wattpad van desde las de dominio público hasta Proyecto Gutenberg a los desarrollados por usuarios locales que luego pueden publicar para audiencias más amplias. Esto significa que los adolescentes y adultos jóvenes pueden escribir y saber que su trabajo puede llegar a muchas personas. Como tal, es importante que entiendan cómo mantenerse seguros en Wattpad.</p>            
                <a href="general?action=inicio">Si quieres saber mas sobre wattpad, ingresa aquí</a>
            </section>
            <section class="secweb">
                <img src="assets/img/webtoon.png_large" alt="" class="logo">
                <h5>¿COMO OCURRE WEBTOON?</h5>
                <p>De la necesidad de leer cómics de la manera más sencilla y cómoda posible, surgió en Corea del Sur el webtoon, un formato de historietas de cómic digital que destaca por leerse en formato vertical. Pero aunque este formato de lectura de cómic ha cuajado en España hace relativamente poco, en Corea del sur nació en 2003 cuando el sitio web Daum estrenó el primer servicio de webtoon de la historia fusionando contenido gratuito y de pago.</p>
                <a href="general?action=inicioweb">Si quieres saber mas sobre webtoon, ingresa aquí</a>
            </section>
        </div>
    </main>
    <footer>
        <p>Creado por Michel Oriana Mateus Ayure</p>
    </footer>

</body>
</html>