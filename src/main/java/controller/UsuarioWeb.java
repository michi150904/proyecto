package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioWeb.UsuarioWebDAO;
import model.UsuarioWeb.UsuarioWebVAO;

public class UsuarioWeb extends HttpServlet {
    UsuarioWebVAO u= new UsuarioWebVAO();
    UsuarioWebDAO ud= new UsuarioWebDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println ("Entro al doget");
    String action=req.getParameter("action");
    switch (action){
        case "abrirForm":
        req.getRequestDispatcher("views/webtoon/Usuario/form_login.jsp").forward(req, resp);
        System.out.println("se abrio el formulario");
        System.out.println(action);

    break;
        case "loginwe":   
        req.getRequestDispatcher("views/webtoon/Usuario/login.jsp").forward(req, resp);
    break;
        case "agr-dash":
        req.getRequestDispatcher("views/webtoon/Usuario/dashboard.jsp").forward(req, resp);
    break;
        case "agr-lib":
        req.getRequestDispatcher("views/webtoon/Usuario/agregar-comic.jsp").forward(req, resp);
    break;  
        case "inicio":
        req.getRequestDispatcher("views/webtoon/Usuario/index-comic.jsp").forward(req, resp);
    break;


    }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al do post");
        String a=req.getParameter("action");
        switch (a){
            case "add":

        if (req.getParameter("nombre")!=null){
            u.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("apellido")!=null){
            u.setApellido(req.getParameter("apellido"));
        }
        if(req.getParameter("correo")!=null){
            u.setCorreo_Electronico(req.getParameter("correo"));
        }
        if(req.getParameter("clave")!=null){
            u.setClave(req.getParameter("clave"));
        }
        if(req.getParameter("estado")!=null){
            u.setEstado(true);
        }
        else{
            u.setEstado(false);
        }
        try {
            ud.registrar(u);
            System.out.println("Se registro correctamente usuario");
            req.getRequestDispatcher("views/webtoon/Usuario/login.jsp").forward(req, resp);

        } catch (Exception e) {
            System.out.println("error en el registro usuario"+e.getMessage().toString());
        }
        break;
        }
    }
}
