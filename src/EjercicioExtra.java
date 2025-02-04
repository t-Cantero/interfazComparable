import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class EjercicioExtra {
    public static void main(String[] args) {
        String archivoEntrada = "/home/estudiant/IdeaProjects/interfazComparable/src/reparaciones_vehiculos.txt";//archivo ruta archivo
        Map<String, List<Integer>> vehiculos = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
            br.lines().forEach(line -> {
                String[] partes = line.split(",");
                if (partes.length > 2) {
                    String clave = partes[0] + "," + partes[1];
                    List<Integer> costos = Arrays.stream(partes, 2, partes.length)
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());
                    vehiculos.put(clave, costos);
                }
            });
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }
        int precioMaximo = vehiculos.values().stream()
                .flatMap(List::stream)
                .max(Integer::compareTo)
                .orElse(0);

        System.out.println("El precio máximo de reparación es: " + precioMaximo);
    }
}

