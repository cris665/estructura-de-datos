package Recursividad.actividad03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Scanner para leer desde la terminal
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario la cantidad de filas
        System.out.print("Ingresa el número de filas: ");
        int filasIngresadas = scanner.nextInt();

        // 3. Crear el objeto PatronNumerico con el valor ingresado
        PatronNumerico patron = new PatronNumerico(filasIngresadas);

        // 4. Imprimir el triángulo
        System.out.println("\nResultado:");
        patron.imprimirTriangulo(1);

        // 5. Cerrar el scanner
        scanner.close();
    }
}