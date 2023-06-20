package model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexion;

public class UsuarioDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;
    int r;

    public int registrar (UsuarioVAO usuario) throws SQLException{
        sql="insert into Usuario(Id_Usuario,Nombre_Usuario,Apellido_Usuario,Correo_Electronico,Clave,Estado) values (null,?,?,?,?,?)";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getCorreo_Electronico());
            ps.setString(4, usuario.getClave());
            ps.setBoolean(5, usuario.getEstado());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("se registro correctamente dao");
        }
        catch (Exception e){
            System.out.println("error en el registro dao"+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
    return r;
    }

}
