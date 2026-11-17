package Recursividad.actividad04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Scanner para leer desde la terminal
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario el tamaño del rombo
        System.out.print("Ingresa el tamaño del rombo (debe ser un número impar): ");
        int tamanoIngresado = scanner.nextInt();

        // 3. Crear el objeto Rombo con el valor ingresado
        Rombo rombo = new Rombo(tamanoIngresado);

        // 4. Dibujar el rombo
        System.out.println("\nResultado:");
        rombo.dibujarRombo();

        // 5. Cerrar el scanner
        scanner.close();
    }
}