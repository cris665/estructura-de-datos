package ejercicios_listas_ordenadas.problema2;

public class Incidencia implements Comparable<Incidencia> {

    private int numero;
    private Prioridad prioridad;
    private String descripcion;

    public Incidencia(int numero, Prioridad prioridad, String descripcion) {
        this.numero = numero;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int compareTo(Incidencia otra) {
        // Criterio 1: prioridad de mayor a menor (Alta, Media, Baja)
        int porPrioridad = Integer.compare(otra.prioridad.getNivel(), this.prioridad.getNivel());
        if (porPrioridad != 0) {
            return porPrioridad;
        }
        // Criterio 2: con la misma prioridad, numero de menor a mayor
        return Integer.compare(this.numero, otra.numero);
    }

    @Override
    public String toString() {
        return String.format("%-6d %-28s %s", numero, descripcion, prioridad);
    }
}
