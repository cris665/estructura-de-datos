package Conjuntos;

import java.util.EmptyStackException;
import java.util.Iterator;

public class BarajaLoteria {
    private SetADT<Carta> conjuntoCartas;

    public BarajaLoteria() {
        this.conjuntoCartas = new ArraySet<>();
    }

    /**
     * Agrega una carta al conjunto. ArraySet evita elementos duplicados.
     */
    public boolean agregarCarta(Carta carta) {
        if (conjuntoCartas.contains(carta)) {
            return false;
        }
        conjuntoCartas.add(carta);
        return true;
    }

    /**
     * Extrae y elimina una carta al azar del conjunto usando removeRandom().
     */
    public Carta sacarCartaAleatoria() {
        if (conjuntoCartas.isEmpty()) {
            return null;
        }
        try {
            return conjuntoCartas.removeRandom();
        } catch (EmptyStackException e) {
            return null;
        }
    }

    public int cartasRestantes() {
        return conjuntoCartas.size();
    }

    public boolean estaVacia() {
        return conjuntoCartas.isEmpty();
    }


    /**
     * Imprime todas las cartas que hay en el conjunto, recorriéndolo con su iterador.
     */
    public void mostrarCartas() {
        Iterator<Carta> recorrido = conjuntoCartas.iterator();
        while (recorrido.hasNext()) {
            System.out.println(recorrido.next());
        }
    }

    /**
     * Agrega al conjunto las 54 cartas de la lotería mexicana tradicional.
     */
    public void cargarBarajaTradicional() {
        String[] cartas = {
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

        for (int i = 0; i < cartas.length; i++) {
            agregarCarta(new Carta(i + 1, cartas[i]));
        }
    }
}
