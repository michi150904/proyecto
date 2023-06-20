package model.UsuarioWeb;

public class UsuarioWebVAO {
        private int Id_Usuario;
    private String Nombre;
    private String Apellido;
    private String Correo_Electronico;
    private String Clave;
    private boolean Estado;
    public UsuarioWebVAO(){

    }
    public UsuarioWebVAO(int id_Usuario, String nombre, String apellido, String correo_Electronico, String clave,
            boolean estado) {
        Id_Usuario = id_Usuario;
        Nombre = nombre;
        Apellido = apellido;
        Correo_Electronico = correo_Electronico;
        Clave = clave;
        Estado = estado;
    }
    public int getId_Usuario() {
        return Id_Usuario;
    }
    public void setId_Usuario(int id_Usuario) {
        Id_Usuario = id_Usuario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }
    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String clave) {
        Clave = clave;
    }
    public boolean getEstado() {
        return Estado;
    }
    public void setEstado(boolean estado) {
        Estado = estado;
    }
    

}
