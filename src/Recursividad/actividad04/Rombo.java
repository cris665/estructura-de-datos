package Recursividad.actividad04;

public class Rombo {
    private int tamano;

    public Rombo(int tamano) {
        this.tamano = tamano;
    }

    public void dibujarRombo() {
        if (tamano % 2 == 0 || tamano <= 0) {
            System.out.println("Error: El tamaño debe ser un número impar mayor a cero.");
            return;
        }

        int alturaMitad = (tamano / 2) + 1;
        dibujarMitadSuperior(1, alturaMitad);
        dibujarMitadInferior(alturaMitad - 1, alturaMitad);
    }

    public void dibujarMitadSuperior(int nivel, int limite) {
        // Caso base
        if (nivel > limite) {
            return;
        }

        imprimirEspacios(limite - nivel);
        imprimirArrobas(2 * nivel - 1);
        System.out.println();

        // Paso recursivo
        dibujarMitadSuperior(nivel + 1, limite);
    }

    public void dibujarMitadInferior(int nivel, int limite) {
        // Caso base
        if (nivel < 1) {
            return;
        }

        imprimirEspacios(limite - nivel);
        imprimirArrobas(2 * nivel - 1);
        System.out.println();

        // Paso recursivo
        dibujarMitadInferior(nivel - 1, limite);
    }

    // Métodos auxiliares recursivos
    private void imprimirEspacios(int cantidad) {
        if (cantidad <= 0) return; // Caso base
        System.out.print(" ");
        imprimirEspacios(cantidad - 1); // Paso recursivo
    }

    private void imprimirArrobas(int cantidad) {
        if (cantidad <= 0) return; // Caso base
        System.out.print("@");
        imprimirArrobas(cantidad - 1); // Paso recursivo
    }
    
}
