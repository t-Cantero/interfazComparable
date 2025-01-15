import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HacerPeliculas {
    public static void main(String[] args) {
        ArrayList<Peliculas> peliculas = new ArrayList<>();
        Peliculas peliculas1 = new Peliculas("Cochete Gordo","Porno",2003);
        peliculas.add(peliculas1);
        Peliculas peliculas2 = new Peliculas("Adrian Mongolo","Documental vs Sindrome de Down",1990);
        peliculas.add(peliculas2);
        Peliculas peliculas3 = new Peliculas("Gyats","Mujeres",2025);
        peliculas.add(peliculas3);
        Peliculas peliculas4 = new Peliculas("Laura apruébame porfa","Estudios",2005);
        peliculas.add(peliculas4);

        for(Peliculas pelicula : peliculas){
            System.out.println(pelicula);
        }

        long count = peliculas.stream()
                .filter(Peliculas -> Peliculas.getAnyo()>2000 && Peliculas.getAnyo()<2005)
                .count();

        List<Peliculas> lista = peliculas.stream()
                .filter(Peliculas -> Peliculas.getAnyo()>2000 && Peliculas.getAnyo()<2005)
                .collect(Collectors.toList());
        System.out.println("Hay "+count+ " peliclas entre 2000 y 2005: ");
        System.out.println();
        lista.forEach(System.out::println);
    }
}
