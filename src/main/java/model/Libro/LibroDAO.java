package model.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


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
            ps.setString(6,libro.getEstado());
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

    public void Eliminar (int Id_Libro )throws SQLException{
        sql="delete from libro where Id_Libro="+Id_Libro;
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se elimino el libro exitosamente dao");
        }
        catch (Exception e){
            System.out.println("Error al eliminar el libro dao");
        }
        finally{
            con.close();
        }
    }

    public void Actualizar (int id,String nom, String nomAu, String cat, String gene, String fecha, String est)throws SQLException{
        sql="UPDATE `libro` SET `Nombre_Libro`='"+nom+"',`Nombre_Autor`='"+nomAu+"',`Categoria`='"+cat+"',`Genero`='"+gene+"',`Fecha_Publicacion`='"+fecha+"',`Estado_Libro`='"+est+"' WHERE Id_Libro="+id;
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se actualizo bien dao");

        }
        catch(Exception e){
            System.out.println("error no se actualizo dao"+e.getMessage().toString());
        }
        finally{
            con.close();
        }
    }

    public List<LibroVAO>Listar() throws SQLException{
        List<LibroVAO> ListarLibros= new ArrayList<>();
        sql="select * from libro";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while (rs.next()) {
                LibroVAO row= new LibroVAO();
                row.setId_Libro(rs.getInt("Id_Libro"));
                row.setNombre_Libro(rs.getString("Nombre_Libro"));
                row.setAutor(rs.getString("Nombre_Autor"));
                row.setCategoria(rs.getString("Categoria"));
                row.setGenero(rs.getString("Genero"));
                row.setFecha_Publicacion(rs.getString("Fecha_Publicacion"));
                row.setEstado(rs.getString("Estado_Libro"));
                ListarLibros.add(row);
            }
            ps.close();
            System.out.println("consulta exitosa dao");
        } catch (Exception e) {
            System.out.println("No se pudo realizar la consulta dao"+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return ListarLibros;
    }
}
