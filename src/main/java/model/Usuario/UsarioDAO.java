package model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexion;

public class UsarioDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;
    int r;

    public int registrar (UsuarioVAO usuario) throws SQLException{
        sql="INSERT INTO Usuario(Id_Usuario,Nombre_Usuario,Apellido_Usuario,Correo_Electronico,Clave,Estado) values (?,?,?,?,?,?)";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, usuario.getId_Usuario());
            ps.setString(2,usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getCorreo_Electronico());
            ps.setString(5, usuario.getClave());
            ps.setString(6, usuario.getEstado());
            System.out.println("se registro correctamente");
        }
        catch (Exception e){
            System.out.println("error en el registro"+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexió
        }
    return r;
    }
}
