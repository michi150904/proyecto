package controller;
import java.io.IOException;
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
        
            default:
                break;
        }
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al do post");
        String a=req.getParameter("action");
        switch (a) {
            case "Crear":
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
                    l.setEstado(true);
                }
                else{
                    l.setEstado(false);
                }
                try{
                    ld.crear(l);
                    System.out.println("Se creo correctamente el libro, libro");
                    req.getRequestDispatcher("views/wattpad/Usuario/dashboard.jsp").forward(req, resp);;
                }
                catch (Exception e){
                    System.out.println("Error, no se pudo crear libro"+e.getMessage().toString());
                }
                break;
        
            default:
                break;
        }
        }
    
}
