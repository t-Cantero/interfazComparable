import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        String frase = Utilidades.leerCadena("Introduce una cadena: ");
        Stack parentesis = new Stack();
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '(' || frase.charAt(i) == '[' || frase.charAt(i) == '{') {
                parentesis.push(frase.charAt(i));
            }
            if (frase.charAt(i) == ')' || frase.charAt(i) == ']' || frase.charAt(i) == '}') {
                caracter = frase.charAt(i);
                if (!comprobar(parentesis, caracter)) {
                    System.out.println("Está mal parentizada");
                    break;
                } else {
                    if (parentesis.isEmpty()) {

                    } else {
                        parentesis.pop();
                    }
                }


            }
            if (i == frase.length() - 1) {
                if (parentesis.isEmpty()) {
                    System.out.println("!Todo Correcto!");
                } else {
                    System.out.println("Está mal parentizada");
                }
            }
        }

    }

    static boolean comprobar(Stack parentesis, char caracter) {
        boolean decision = true;
        if (parentesis.isEmpty()) {
            decision = false;
        } else {
            char ultimoElemento = (char) parentesis.peek();

            if (caracter == ']') {
                if (ultimoElemento != '[' || parentesis.isEmpty()) {
                    decision = false;
                }
            }
            if (caracter == ')') {
                if (ultimoElemento != '(' || parentesis.isEmpty()) {
                    decision = false;
                }
            }
            if (caracter == '}') {
                if (ultimoElemento != '{' || parentesis.isEmpty()) {
                    decision = false;
                }
            }
        }
        return decision;
    }
}
