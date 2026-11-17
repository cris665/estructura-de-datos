package Recursividad.actividad1;

public class Figura {
    private int altura;

    public Figura(int altura) {
        this.altura = altura;
    }

    public void dibujarPiramide(int nivelActual) {
        if (nivelActual > altura) {
            return;
        }

        imprimirEspacios(altura - nivelActual);
        imprimirAsteriscos(2 * nivelActual - 1);
        System.out.println();

        dibujarPiramide(nivelActual + 1);
    }

    private void imprimirEspacios(int cantidad) {
        if (cantidad <= 0) return;
        System.out.print(" ");
        imprimirEspacios(cantidad - 1);
    }

    private void imprimirAsteriscos(int cantidad) {
        if (cantidad <= 0) return;
        System.out.print("*");
        imprimirAsteriscos(cantidad - 1);
    }
}
