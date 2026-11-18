package Colecciones;

public class Main {

    public static void main(String[] args) {
        Loteria loteria = new Loteria();

        // 1. Agregar las cartas al conjunto
        loteria.agregarCartas();

        // 2. Imprimir las cartas agregadas
        System.out.println("CARTAS AGREGADAS: " + loteria.cartasRestantes());
        loteria.imprimirCartas();

        // 3. Sacar e imprimir las cartas de manera aleatoria
        System.out.println("\nCARTAS SACADAS DE MANERA ALEATORIA");
        int turno = 1;
        while (!loteria.estaVacia()) {
            System.out.printf("%2d.  %s%n", turno, loteria.sacarCarta());
            turno++;
        }
        System.out.println("\nCartas restantes: " + loteria.cartasRestantes());
    }
}
