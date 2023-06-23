package model.LibroWeb;

public class LibroWebVAO {
    private int IdLibro;
    private String NombreLibro;
    private String Autor;
    private String Categoria;
    private String Genero;
    private String FechaPublicacion;
    private String Estado;

    public LibroWebVAO(int idLibro, String nombreLibro, String autor, String categoria, String genero,
            String fechaPublicacion, String estado) {
        IdLibro = idLibro;
        NombreLibro = nombreLibro;
        Autor = autor;
        Categoria = categoria;
        Genero = genero;
        FechaPublicacion = fechaPublicacion;
        Estado = estado;
    }

    public LibroWebVAO(){
    }

    public int getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(int idLibro) {
        IdLibro = idLibro;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        NombreLibro = nombreLibro;
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

    public String getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }


}
