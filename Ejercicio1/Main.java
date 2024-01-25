package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        realizarOperacion(5);
    }

    static void realizarOperacion(int cantidadOperaciones){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadOperaciones; i++) {
            System.out.println("Operación " + (i+1));
            //Num1
            System.out.println("Ingrese el primer número:");
            int num1 = scanner.nextInt();

            //Num2
            System.out.println("Ingrese el segundo número:");
            int num2 = scanner.nextInt();

            //Operacion
            System.out.println("Seleccione la operación colocando el signo (+,-,*,/): ");
            char opcion = scanner.next().charAt(0);

            //Resultado
            int resultado = operar(num1, num2, opcion);

            System.out.println("El resultado es: " + resultado + "\n\n");
            evaluarResultado(resultado);
        }
    }

    static int operar(int num1, int num2, char opcion){
        int resultado = 0;
        switch (opcion) {
            case '+':
                resultado = Calculadora.sumar(num1, num2);
                break;
            case '-':
                resultado = Calculadora.restar(num1, num2);
                break;
            case '*':
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case '/':
                resultado = Calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida");
                return resultado;
        }

        return resultado;
    }

    static void evaluarResultado(int resultado){
        if(resultado <= 0){
            System.out.println("Tené cuidado, el resultado es negativo!");
        } else if (resultado >= 0 && resultado <= 10000){
            System.out.println("Resultado dentro de los límites");
        } else {
            System.out.println("Error, resultado muy grande");
        }
    }
}
