public class Peliculas {
    private String nombre;
    private String categoria;
    private int anyo;

    public Peliculas(String nombre, String categoria, int anyo){
        this.nombre = nombre;
        this.categoria = categoria;
        this.anyo = anyo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public int getAnyo(){
        return this.anyo;
    }
    public String toString(){
        return "Titulo: "+nombre+", Género: "+ categoria+", Año: "+anyo;
    }
}
