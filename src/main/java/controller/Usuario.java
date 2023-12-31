package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario.UsuarioDAO;
import model.Usuario.UsuarioVAO;

public class Usuario extends HttpServlet {
    UsuarioVAO u= new UsuarioVAO();
    UsuarioDAO ud= new UsuarioDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println ("Entro al doget");
    String action=req.getParameter("action");
    switch (action){
        case "abrirFormWat":
        req.getRequestDispatcher("views/wattpad/Usuario/form_login.jsp").forward(req, resp);
        System.out.println("se abrio el formulario");
        System.out.println(action);

    break;
        case "login":   
        req.getRequestDispatcher("views/wattpad/Usuario/login.jsp").forward(req, resp);
    break;
        case "agr-dash":
        req.getRequestDispatcher("views/wattpad/Usuario/dashboard.jsp").forward(req, resp);
    break;
        case "agr-lib":
        req.getRequestDispatcher("views/wattpad/Usuario/agregar-libro.jsp").forward(req, resp);
    break;  
        case "inicio":
        req.getRequestDispatcher("views/wattpad/Usuario/index-wat.jsp").forward(req, resp);
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
            req.getRequestDispatcher("views/wattpad/Usuario/login.jsp").forward(req, resp);

        } catch (Exception e) {
            System.out.println("error en el registro usuario"+e.getMessage().toString());
        }
        break;
        }
    }
}

