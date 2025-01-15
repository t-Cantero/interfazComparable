import java.util.*;

public class ExpresionesAritmeticas {

    public static void main(String[] args){
        String operacion;
        System.out.println(evaluarExpresion(operacion = "5 1 2 + 4 * + 3 -"));
        System.out.println(evaluarExpresion(operacion = "2 4 5 3 / * +"));
        System.out.println(evaluarExpresion(operacion = "6"));
        System.out.println(evaluarExpresion(operacion = "3 5 4 + *"));
    }

    public static int evaluarExpresion(String operacion){
        Stack<Character> numeros = new Stack<>(); // Usar Stack<Character> en lugar de Stack
        Stack<Integer> pilas = new Stack();
        String operadores ="";
        Stack<Character> operadoresCaracteres = new Stack<>();
        int resultado = 0;
        char signo;
        for(int i = 0; i < operacion.length(); i++){ //agrupar numeros y operadores en diferentes pilas
            if(operacion.charAt(i) == ' '){
                continue; // Ignorar espacios en blanco
            } else {
                if(operacion.charAt(i) != '+' && operacion.charAt(i) != '-' && operacion.charAt(i) != '*' && operacion.charAt(i) != '/' && !Character.isDigit(operacion.charAt(i))){
                    // Si el carácter no es un operador ni un dígito, no hacer nada
                    continue;
                } else {
                    if(operacion.charAt(i) == '+' || operacion.charAt(i) == '-' || operacion.charAt(i) == '*' || operacion.charAt(i) == '/'){
                        // Si es un operador
                        operadores += operacion.charAt(i);
                    } else {
                        // Si es un dígito, agregarlo a la pila
                        numeros.add(operacion.charAt(i));
                    }
                }
            }
        }
        for(int i = 0;i<operadores.length()-1;i++){//recorrer operadores y ordenar por prioridad

        }
        for(int i = 0; i < operacion.length(); i++){
            if(operacion.charAt(i) == ' '){
                continue; // Ignorar espacios en blanco
            } else {
                if(operacion.charAt(i) != '+' && operacion.charAt(i) != '-' && operacion.charAt(i) != '*' && operacion.charAt(i) != '/' && !Character.isDigit(operacion.charAt(i))){
                    // Si el carácter no es un operador ni un dígito, no hacer nada
                    continue;
                } else {
                    if(operacion.charAt(i) == '+' || operacion.charAt(i) == '-' || operacion.charAt(i) == '*' || operacion.charAt(i) == '/'){
                        // Si es un operador
                        signo = operacion.charAt(i);
                        resultado = calculo(pilas, signo);// Calcular el resultado
                        pilas.remove(0); // Remover los dos primeros números de la pila
                        pilas.remove(0);
                        pilas.addFirst(resultado); // Agregar el resultado como carácter
                    } else {
                        // Si es un dígito, agregarlo a la pila
                        pilas.add(Character.getNumericValue(operacion.charAt(i)));
                        if(i == operacion.length()-1 && !pilas.isEmpty()){
                            resultado = pilas.peek();
                        }
                    }
                }
            }
        }
        return resultado;
    }

    public static int calculo(Stack<Integer> pilas, char signo){
        int resultado = 0;
        int numero1 = pilas.get(0);
        int numero2 = pilas.get(1);

        // Realizar la operación correspondiente
        switch (signo){
            case '+':
                resultado = numero1 + numero2;
                break;

            case '-':
                resultado = numero1 - numero2;
                break;

            case '*':
                resultado = numero1 * numero2;
                break;

            case '/':
                resultado = numero1 / numero2;
                break;
        }
        return resultado;
    }
}
