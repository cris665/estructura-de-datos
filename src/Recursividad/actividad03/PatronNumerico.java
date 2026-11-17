package Recursividad.actividad03;

public class PatronNumerico {
    private int filas;

    public PatronNumerico(int filas) {
        this.filas = filas;
    }

    public void imprimirTriangulo(int filaActual) {
        // Caso base: detenerse cuando la fila actual supere el número de filas
        if (filaActual > filas) {
            return;
        }

        imprimirNumerosFila(1, filaActual);
        System.out.println();

        // Paso recursivo para la siguiente fila
        imprimirTriangulo(filaActual + 1);
    }

    // Método auxiliar recursivo para imprimir los números de una misma fila
    private void imprimirNumerosFila(int numeroActual, int limite) {
        // Caso base
        if (numeroActual > limite) {
            return;
        }

        System.out.print(numeroActual + (numeroActual == limite ? "" : " "));

        // Paso recursivo para el siguiente número
        imprimirNumerosFila(numeroActual + 1, limite);
    }
}
