import java.util.*;

public class RepartoRegalosT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leer la cantidad de niños
            System.out.println("Introduce el número de niños: ");
            int n = scanner.nextInt();

            // Si n es 0, terminamos
            if (n == 0) {
                break;
            }

            // Crear una lista para almacenar los niños
            List<Nino> ninos = new ArrayList<>();

            // Leer los datos de los niños
            for (int i = 0; i < n; i++) {
                System.out.println("Introduce la bondad: ");
                int bondad = scanner.nextInt();
                System.out.println("Introduce la peso: ");
                int peso = scanner.nextInt();
                ninos.add(new Nino(bondad, peso));
            }

            // Ordenar la lista de niños según las reglas dadas
            ninos.sort((n1, n2) -> {
                if (n1.bondad != n2.bondad) {
                    return n2.bondad - n1.bondad; // Mayor bondad primero
                }
                return n1.peso - n2.peso; // Menor peso primero en caso de empate
            });

            // Imprimir la lista ordenada
            for (Nino nino : ninos) {
                System.out.println(nino.bondad + " " + nino.peso);
            }

            // Línea en blanco después de cada caso de prueba
            System.out.println();
        }

        scanner.close();
    }

    // Clase para representar a un niño
    static class Nino {
        int bondad;
        int peso;

        Nino(int bondad, int peso) {
            this.bondad = bondad;
            this.peso = peso;
        }
    }
}