package Colecciones;

import java.util.Iterator;

public class Loteria {

    // Las cartas se guardan en un conjunto: no hay repetidas y el orden no importa
    private SetADT<Carta> baraja;

    public Loteria() {
        baraja = new ArraySet<>();
    }

    // Agrega una carta al conjunto (si ya existe, el conjunto la ignora)
    public void agregarCarta(Carta carta) {
        baraja.add(carta);
    }

    // Agrega las 54 cartas de la lotería mexicana
    public void agregarCartas() {
        String[] nombres = {
            "El Gallo", "El Diablito", "La Dama", "El Catrín", "El Paraguas", "La Sirena",
            "La Escalera", "La Botella", "El Barril", "El Árbol", "El Melón", "El Valiente",
            "El Gorrito", "La Muerte", "La Pera", "La Bandera", "El Bandolón", "El Violoncello",
            "La Garza", "El Pájaro", "La Mano", "La Bota", "La Luna", "El Cotorro",
            "El Borracho", "El Negrito", "El Corazón", "La Sandía", "El Tambor", "El Camarón",
            "Las Jaras", "El Músico", "La Araña", "El Soldado", "La Estrella", "El Cazo",
            "El Mundo", "El Apache", "El Nopal", "El Alacrán", "La Rosa", "La Calavera",
            "La Campana", "El Cantarito", "El Venado", "El Sol", "La Corona", "La Chalupa",
            "El Pino", "El Pescado", "La Palma", "La Maceta", "El Arpa", "La Rana"
        };
        for (int i = 0; i < nombres.length; i++) {
            agregarCarta(new Carta(i + 1, nombres[i]));
        }
    }

    // Imprime las cartas que hay en el conjunto recorriéndolo con su iterador
    public void imprimirCartas() {
        Iterator<Carta> scan = baraja.iterator();
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }

    // Saca (y elimina) una carta al azar usando removeRandom del conjunto
    public Carta sacarCarta() {
        return baraja.removeRandom();
    }

    public int cartasRestantes() {
        return baraja.size();
    }

    public boolean estaVacia() {
        return baraja.isEmpty();
    }
}
