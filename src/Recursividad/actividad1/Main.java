package Recursividad.actividad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir la altura deseada por consola
        System.out.print("Ingresa la altura de la pirámide: ");
        int alturaIngresada = scanner.nextInt();

        // 3. Crear el objeto Figura con la altura que escribió el usuario
        Figura piramide = new Figura(alturaIngresada);

        // 4. Dibujar la pirámide iniciando en el nivel 1
        System.out.println("\nResultado:");
        piramide.dibujarPiramide(1);

        // 5. Cerrar el scanner
        scanner.close();
    }
}