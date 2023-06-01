import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.tools.ForwardingFileObject;

public class general extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        System.out.println(action);
        switch (action){
            //principal
            case "inicioprin":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;
            //wattpad
            case "login":   
                req.getRequestDispatcher("views/wattpad/Usuario/login.jsp").forward(req, resp);
                break;
            
            case "registrar":
                req.getRequestDispatcher("views/wattpad/Usuario/form_login.jsp").forward(req, resp);
                break;
            
            case "inicio":
                req.getRequestDispatcher("views/wattpad/Usuario/index-wat.jsp").forward(req, resp);
                break;

            case "agr-dash":
                req.getRequestDispatcher("views/wattpad/Usuario/dashboard.jsp").forward(req, resp);
                break;

            case "lib-cre":
                req.getRequestDispatcher("views/wattpad/Libro/libro-crea.jsp").forward(req, resp);
                break;
            
            case "lib-eli":
                req.getRequestDispatcher("views/wattpad/Libro/libro-elimina.jsp").forward(req, resp);
                break;

            case "agr-lib":
                req.getRequestDispatcher("views/wattpad/Usuario/agregar-libro.jsp").forward(req, resp);
                break;  

            //webtoon
            case "inicioweb":
                req.getRequestDispatcher("views/webtoon/Usuario/index-comic.jsp").forward(req, resp);
                break;
            
            case "loginweb":
                req.getRequestDispatcher("views/webtoon/Usuario/login.jsp").forward(req, resp);
                break;

            case "formlogweb":
                req.getRequestDispatcher("views/webtoon/Usuario/form_login.jsp").forward(req, resp);
                break;

            case "dashweb":
                req.getRequestDispatcher("views/webtoon/Usuario/dashboard.jsp").forward(req, resp);
                break;

            case "comiccrea":
                req.getRequestDispatcher("views/webtoon/Libro/comic-crea.jsp").forward(req, resp);
                break;

            case "comicelim":
                req.getRequestDispatcher("views/webtoon/Libro/comic-elimina.jsp").forward(req, resp);
                break;

            case "agregcomic":
                req.getRequestDispatcher("views/webtoon/Usuario/agregar-comic.jsp").forward(req, resp);
                break;
            default:
            System.out.println("error");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action=req.getParameter("action");
    System.out.println(action);
    switch (action){
        //watpad
        case "Ingresar":
        req.getRequestDispatcher("views/wattpad/Usuario/dashboard.jsp").forward(req, resp);
        break;

        case "Registrar":
        req.getRequestDispatcher("views/wattpad/Usuario/login.jsp").forward(req, resp);
        break;

        //webtoon

        case "Registrarweb":
        req.getRequestDispatcher("views/webtoon/Usuario/login.jsp").forward(req, resp);
        break;

        case "Ingresarweb":
        req.getRequestDispatcher("views/webtoon/Usuario/dashboard.jsp").forward(req, resp);
        break;
        default:
        System.out.println("Error");
        
    }
    }

}
