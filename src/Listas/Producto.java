package Listas;

public class Producto implements Comparable<Producto> {
    private String id;
    private String nombre;
    private double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public int compareTo(Producto otro) {
        // Criterio: Precio de menor a mayor (ascendente)
        return Double.compare(this.precio, otro.precio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof String) {
            return this.id.equalsIgnoreCase((String) obj);
        }
        if (getClass() != obj.getClass()) return false;
        Producto otro = (Producto) obj;
        return this.id.equalsIgnoreCase(otro.id);
    }

    @Override
    public int hashCode() {
        return id.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return String.format("%-5s | %-20s | $%8.2f", id, nombre, precio);
    }
}