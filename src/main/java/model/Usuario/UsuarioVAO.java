package model.Usuario;

public class UsuarioVAO {
    
    private int Id_Usuario;
    private String Nombre;
    private String Apellido;
    private String Correo_Electronico;
    private String Clave;
    private boolean Estado;

    public UsuarioVAO() {
    }
    public UsuarioVAO(int id_Usuario, String nombre, String apellido, String correo_Electronico, String clave,
            boolean estado) {
        this.Id_Usuario = id_Usuario;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Correo_Electronico = correo_Electronico;
        this.Clave = clave;
        this.Estado = estado;
    }
    public int getId_Usuario() {
        return Id_Usuario;
    }
    public void setId_Usuario(int id_Usuario) {
        this.Id_Usuario = id_Usuario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }
    public void setCorreo_Electronico(String correo_Electronico) {
        this.Correo_Electronico = correo_Electronico;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String clave) {
        this.Clave = clave;
    }
    public boolean getEstado() {
        return Estado;
    }
    public void setEstado(boolean estado) {
        this.Estado = estado;
    }
}
