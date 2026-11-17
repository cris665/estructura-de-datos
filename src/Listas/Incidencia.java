package Listas;

public class Incidencia implements Comparable<Incidencia> {
    public enum Prioridad {
        BAJA(1), MEDIA(2), ALTA(3);

        private final int valor;
        Prioridad(int valor) { this.valor = valor; }
        public int getValor() { return valor; }
    }

    private int numero;
    private String descripcion;
    private Prioridad prioridad;

    public Incidencia(int numero, String descripcion, Prioridad prioridad) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getNumero() { return numero; }
    public String getDescripcion() { return descripcion; }
    public Prioridad getPrioridad() { return prioridad; }

    @Override
    public int compareTo(Incidencia otra) {
        // Criterio 1: Prioridad de mayor a menor (ALTA > MEDIA > BAJA)
        int compPrioridad = Integer.compare(otra.prioridad.getValor(), this.prioridad.getValor());
        if (compPrioridad != 0) {
            return compPrioridad;
        }
        // Criterio 2: Si tienen la misma prioridad, ordenar por número de menor a mayor
        return Integer.compare(this.numero, otra.numero);
    }

    @Override
    public String toString() {
        return String.format("%-8d %-28s %-10s", numero, descripcion, prioridad);
    }
}