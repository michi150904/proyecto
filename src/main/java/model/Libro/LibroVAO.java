package model.Libro;

public class LibroVAO {
    
    public LibroVAO(){
    }
    public LibroVAO(int id_Libro, String nombre_Libro, String autor, String categoria, String genero,
            String fecha_Publicacion, boolean estado) {
        Id_Libro = id_Libro;
        Nombre_Libro = nombre_Libro;
        Autor = autor;
        Categoria = categoria;
        Genero = genero;
        Fecha_Publicacion = fecha_Publicacion;
        Estado = estado;
    }
    
    public int getId_Libro() {
        return Id_Libro;
    }
    public void setId_Libro(int id_Libro) {
        Id_Libro = id_Libro;
    }
    public String getNombre_Libro() {
        return Nombre_Libro;
    }
    public void setNombre_Libro(String nombre_Libro) {
        Nombre_Libro = nombre_Libro;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
    public String getFecha_Publicacion() {
        return Fecha_Publicacion;
    }
    public void setFecha_Publicacion(String fecha_Publicacion) {
        Fecha_Publicacion = fecha_Publicacion;
    }
    public boolean getEstado() {
        return Estado;
    }
    public void setEstado(boolean estado) {
        Estado = estado;
    }

    private int Id_Libro;
    private String Nombre_Libro;
    private String Autor;
    private String Categoria;
    private String Genero;
    private String Fecha_Publicacion;
    private boolean Estado;

}
