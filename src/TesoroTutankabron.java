import java.util.*;

public class TesoroTutankabron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leer la cantidad de objetos
            System.out.println("Introduce la cantidad de objetos: ");
            int n = scanner.nextInt();

            // Si n es 0, terminamos
            if (n == 0) {
                break;
            }

            // Crear una lista para almacenar los objetos
            List<Objeto> objetos = new ArrayList<>();

            // Leer los datos de los objetos
            for (int i = 0; i < n; i++) {
                System.out.println("Introduce el objeto: ");
                String nombre = scanner.next();
                System.out.println("Introduce el valor: ");
                int valor = scanner.nextInt();
                System.out.println("Introduce el peso: ");
                int peso = scanner.nextInt();
                objetos.add(new Objeto(nombre, valor, peso, i));
            }

            // Ordenar la lista de objetos según las reglas dadas
            objetos.sort((o1, o2) -> {
                if (o1.valor != o2.valor) {
                    return o2.valor - o1.valor; // Mayor valor primero
                }
                if (o1.peso != o2.peso) {
                    return o1.peso - o2.peso; // Menor peso primero
                }
                return o1.indice - o2.indice; // Orden original en caso de empate
            });

            // Imprimir los nombres de los objetos en el orden ordenado
            for (int i = 0; i < objetos.size(); i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(objetos.get(i).nombre);
            }
            System.out.println();
        }

        scanner.close();
    }

    // Clase para representar un objeto
    static class Objeto {
        String nombre;
        int valor;
        int peso;
        int indice;

        Objeto(String nombre, int valor, int peso, int indice) {
            this.nombre = nombre;
            this.valor = valor;
            this.peso = peso;
            this.indice = indice;
        }
    }
}
