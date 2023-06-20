package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro.LibroDAO;
import model.Libro.LibroVAO;

public class Libro extends HttpServlet{
    LibroVAO l=new LibroVAO();
    LibroDAO ld=new LibroDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al doget");
        String a=req.getParameter("action");
        switch (a) {
            case "abrirFormLib":
                req.getRequestDispatcher("views/wattpad/Libro/libro-crea.jsp").forward (req, resp);
                System.out.println("se abrio el formulario de crear libro");
                break;
            case "lib-cre":
                req.getRequestDispatcher("views/wattpad/Libro/libro-crea.jsp").forward(req, resp);
                break;
            
            case "lib-eli":
                mostrar(req,resp);
                break;

            case "agr-lib":
                req.getRequestDispatcher("views/wattpad/Usuario/agregar-libro.jsp").forward(req, resp);
                break;  
            case "actu-lib":
                req.getRequestDispatcher("views/wattpad/Libro/libro-modifica.jsp").forward(req, resp);
                break;
            default:
                break;
        }
        }
        private void mostrar (HttpServletRequest req,HttpServletResponse resp){
            LibroVAO m=new LibroVAO();
            LibroDAO md=new LibroDAO();
            try{
                List<LibroVAO>arrayLibro=md.Listar();
                for (LibroVAO libroVAO : arrayLibro) {
                    System.out.println(libroVAO.getId_Libro()+libroVAO.getNombre_Libro());
                }
                req.setAttribute("libros",arrayLibro);
                req.getRequestDispatcher("views/wattpad/Libro/libro-elimina.jsp").forward(req, resp);
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
                l.setNombre_Libro(req.getParameter("nombrelib"));
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
                l.setFecha_Publicacion(req.getParameter("fechapubli"));
            }
            if(req.getParameter("estado")!=null){
                l.setEstado("Activo");
            }
            else{
                l.setEstado("Inactivo");
            }
            try{
                ld.crear(l);
                System.out.println("Se creo correctamente el libro, libro");
                req.getRequestDispatcher("views/wattpad/Usuario/dashboard.jsp").forward(req, resp);;
            }
            catch (Exception e){
                System.out.println("Error, no se pudo crear libro"+e.getMessage().toString());
            }
        }

        private void eliminar (HttpServletRequest req,HttpServletResponse resp){
            if(req.getParameter("idlibro")!=null){
                l.setId_Libro(Integer.parseInt(req.getParameter("idlibro")));
            }
            try {
                ld.Eliminar(l.getId_Libro());
                req.setAttribute("proceso", true);
                resp.sendRedirect("libro?action=lib-eli");
                System.out.println("Se elimino el libro");
            }
            catch (Exception e){
                req.setAttribute("msg","No se pudo eliminar el libro"+e.getMessage().toString());
                System.out.println("No se pudo eliminar el libro 2"+e.getMessage().toString());            }
        }

        private void actualizar (HttpServletRequest req, HttpServletResponse resp){
            System.out.println(req.getParameter("idlib"));
            if(req.getParameter("idlib")!=null){
                l.setId_Libro(Integer.parseInt(req.getParameter("idlib")));
            }
            if(req.getParameter("nombrelib")!=null){
                l.setNombre_Libro(req.getParameter("nombrelib"));
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
                l.setFecha_Publicacion(req.getParameter("fechapubli"));
            }
            if(req.getParameter("estado")!=null){
                l.setEstado("Activo");
            }
            else{
                l.setEstado("Inactivo");
            }
            try{
                ld.Actualizar(l.getId_Libro(), l.getNombre_Libro(),l.getAutor(),l.getCategoria(),l.getGenero(),l.getFecha_Publicacion(),l.getEstado());
                req.setAttribute("proceso",true);
                resp.sendRedirect("usuario?action=agr-dash");
                System.out.println("Informacion actualizada libro");
            }
             catch (Exception e) {
                req.setAttribute("msg", "No se puede actualizar el registro"+e.getMessage().toString());
                System.out.println("No se puede actualizar el registro"+e.getMessage().toString());
            }

        }
}
