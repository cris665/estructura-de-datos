package Conjuntos;

public class LoteriaMexicana {

    public static void main(String[] args) {
        BarajaLoteria baraja = new BarajaLoteria();

        // 1. Agregar las cartas de la lotería al conjunto
        baraja.cargarBarajaTradicional();

        // 2. Imprimir las cartas agregadas
        System.out.println("CARTAS AGREGADAS AL CONJUNTO: " + baraja.cartasRestantes());
        baraja.mostrarCartas();

        // 3. Sacar las cartas de manera aleatoria hasta vaciar el conjunto
        System.out.println("\nCARTAS SACADAS DE MANERA ALEATORIA");
        int turno = 1;
        while (!baraja.estaVacia()) {
            Carta carta = baraja.sacarCartaAleatoria();
            System.out.printf("%2d.  %s%n", turno, carta);
            turno++;
        }
        System.out.println("\nCartas restantes en el conjunto: " + baraja.cartasRestantes());
    }
}
