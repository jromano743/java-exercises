package Ejercicio1;

public class Calculadora {

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("ERROR: No se puede dividir por cero.");
            return 0;
        }
    }
}
