package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LibroWeb.LibroWebDAO;
import model.LibroWeb.LibroWebVAO;

public class LibroWeb extends HttpServlet {

    LibroWebVAO l=new LibroWebVAO();
    LibroWebDAO ld=new LibroWebDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al doget");
        String a=req.getParameter("action");
        switch (a) {
            case "abrirFormLib":
                req.getRequestDispatcher("views/webtoon/Libro/comic-crea.jsp").forward (req, resp);
                System.out.println("se abrio el formulario de crear comic");
                break;
            case "lib-cre":
                req.getRequestDispatcher("views/webtoon/Libro/comic-crea.jsp").forward(req, resp);
                break;
            
            case "lib-eli":
                mostrar(req,resp);
                break;

            case "agr-lib":
                req.getRequestDispatcher("views/webtoon/Usuario/agregar-comic.jsp").forward(req, resp);
                break;  
            case "actu-lib":
                req.getRequestDispatcher("views/webtoon/Libro/comic-modifica.jsp").forward(req, resp);
                break;
            default:
                break;
        }
        }
        private void mostrar (HttpServletRequest req,HttpServletResponse resp){
            LibroWebVAO m=new LibroWebVAO();
            LibroWebDAO md=new LibroWebDAO();
            try{
                List<LibroWebVAO>arrayLibro=md.Listar();
                req.setAttribute("libros",arrayLibro);
                req.getRequestDispatcher("views/webtoon/Libro/comic-elimina.jsp").forward(req, resp);
                System.out.println("Datos listados correctamente controlador");
            }
            catch(Exception e){
                System.out.println("No se pudo listar"+e.getMessage().toString());
            }
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al do post");
        String a=req.getParameter("action");
        switch (a) {
            case "Crear":
                crear (req,resp);
            break;
            case "Eliminar":
                eliminar(req,resp);
            case "Actualizar":
                actualizar(req,resp);
            default:
                break;
        }
        }
    
        private void crear(HttpServletRequest req, HttpServletResponse resp){
            if(req.getParameter("nombrelib")!=null){
                l.setNombreLibro(req.getParameter("nombrelib"));
            }
            if(req.getParameter("nombreaut")!=null){
                l.setAutor(req.getParameter("nombreaut"));
            }
            if(req.getParameter("categoria")!=null){
                l.setCategoria(req.getParameter("categoria"));
            }
            if(req.getParameter("genero")!=null){
                l.setGenero(req.getParameter("genero"));
            }
            if(req.getParameter("fechapubli")!=null){
                l.setFechaPublicacion(req.getParameter("fechapubli"));
            }
            if(req.getParameter("estado")!=null){
                l.setEstado("Activo");
            }
            else{
                l.setEstado("Inactivo");
            }
            try{
                ld.crear(l);
                System.out.println("Se creo correctamente el comic, libroweb");
                req.getRequestDispatcher("views/webtoon/Usuario/dashboard.jsp").forward(req, resp);;
            }
            catch (Exception e){
                System.out.println("Error, no se pudo crear libro"+e.getMessage().toString());
            }
        }

        private void eliminar (HttpServletRequest req,HttpServletResponse resp){
            if(req.getParameter("idlibro")!=null){
                l.setIdLibro(Integer.parseInt(req.getParameter("idlibro")));
            }
            try {
                ld.Eliminar(l.getIdLibro());
                req.setAttribute("proceso", true);
                resp.sendRedirect("libroweb?action=lib-eli");
                System.out.println("Se elimino el libro");
            }
            catch (Exception e){
                req.setAttribute("msg","No se pudo eliminar el libro"+e.getMessage().toString());
                System.out.println("No se pudo eliminar el libro 2"+e.getMessage().toString());            }
        }

        private void actualizar (HttpServletRequest req, HttpServletResponse resp){
            System.out.println(req.getParameter("idlib"));
            if(req.getParameter("idlib")!=null){
                l.setIdLibro(Integer.parseInt(req.getParameter("idlib")));
            }
            if(req.getParameter("nombrelib")!=null){
                l.setNombreLibro(req.getParameter("nombrelib"));
            }
            if(req.getParameter("nombreaut")!=null){
                l.setAutor(req.getParameter("nombreaut"));
            }
            if(req.getParameter("categoria")!=null){
                l.setCategoria(req.getParameter("categoria"));
            }
            if(req.getParameter("genero")!=null){
                l.setGenero(req.getParameter("genero"));
            }
            if(req.getParameter("fechapubli")!=null){
                l.setFechaPublicacion(req.getParameter("fechapubli"));
            }
            if(req.getParameter("estado")!=null){
                l.setEstado("Activo");
            }
            else{
                l.setEstado("Inactivo");
            }
            try{
                ld.Actualizar(l.getIdLibro(), l.getNombreLibro(),l.getAutor(),l.getCategoria(),l.getGenero(),l.getFechaPublicacion(),l.getEstado());
                req.setAttribute("proceso",true);
                resp.sendRedirect("usuarioweb?action=agr-dash");
                System.out.println("Informacion actualizada comic");
            }
             catch (Exception e) {
                req.setAttribute("msg", "No se puede actualizar el registro"+e.getMessage().toString());
                System.out.println("No se puede actualizar el registro"+e.getMessage().toString());
            }

        }
}
    

