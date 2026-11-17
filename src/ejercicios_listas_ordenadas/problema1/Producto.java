package ejercicios_listas_ordenadas.problema1;

public class Producto implements Comparable<Producto> {

    private String id;
    private String nombre;
    private double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Criterio de comparacion: precio de menor a mayor
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }

    // Dos productos son el mismo si tienen el mismo ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto otro = (Producto) obj;
        return this.id.equalsIgnoreCase(otro.id);
    }

    @Override
    public int hashCode() {
        return id.toUpperCase().hashCode();
    }

    @Override
    public String toString() {
        return String.format("%-4s | %-16s | $%8.2f", id, nombre, precio);
    }
}
