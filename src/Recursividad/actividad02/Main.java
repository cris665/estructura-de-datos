package Recursividad.actividad02;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Scanner para leer desde la terminal
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario que ingrese la palabra o texto
        System.out.print("Ingresa una palabra o frase: ");
        String textoIngresado = scanner.nextLine();

        // 3. Crear el objeto Palabra con lo que escribió el usuario
        Palabra palabra = new Palabra(textoIngresado);

        // 4. Mostrar los resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Número de vocales: " + palabra.contarVocales());
        System.out.println("Texto invertido: " + palabra.invertir());

        // 5. Cerrar el scanner
        scanner.close();
    }
}