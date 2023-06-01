package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario.UsarioDAO;
import model.Usuario.UsuarioVAO;

public class Usuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println ("Entro al doget");
    String a=req.getParameter("action");
    switch (a){
        case "abrirForm":
            abrirForm(req,resp);
    }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
    private void abrirForm(HttpServletRequest req, HttpServletResponse resp){
        try {
            req.getRequestDispatcher("views/wattpad/Usuario/form_login.jsp");
            System.out.println("se abrio el formulario");
        } catch (Exception e) {
            System.out.println("el formulario no se ha abierto"+e.getMessage().toString());        
        }
    }
    
}
