package model.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexion;


public class LibroDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;
    int r;

    public int crear (LibroVAO libro) throws SQLException{
        sql="insert into Libro(Id_Libro,Nombre_Libro,Nombre_Autor,Categoria,Genero,Fecha_Publicacion,Estado_Libro) values (null,?,?,?,?,?,?)";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,libro.getNombre_Libro());
            ps.setString(2,libro.getAutor());
            ps.setString(3,libro.getCategoria());
            ps.setString(4,libro.getGenero());
            ps.setString(5,libro.getFecha_Publicacion());
            ps.setBoolean(6,libro.getEstado());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("se creo un libro correctamente dao");
        }
        catch(Exception e){
            System.out.println("error al crear libro"+e.getMessage().toString());
        }
        finally {
            con.close();
        }
        return r;
    }
}
