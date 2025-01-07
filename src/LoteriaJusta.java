 import java.util.Scanner;
public class LoteriaJusta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce el número de localidades: ");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            long totalInvertido = 0;
            long totalGanado = 0;
            boolean esJusto = true;

            for (int i = 0; i < n; i++) {
                System.out.println("Introduce el total invertido:");
                int invertido = scanner.nextInt();
                System.out.println("Introduce el total ganado:");
                int ganado = scanner.nextInt();

                totalInvertido += invertido;
                totalGanado += ganado;

                if (totalGanado < totalInvertido) {
                    esJusto = false;
                }
            }

            System.out.println(esJusto ? "SI" : "NO");
        }

        scanner.close();
    }
}
