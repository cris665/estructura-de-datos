package ejercicios_listas_ordenadas.problema1;

import Listas.ArrayOrderList;

public class CatalogoProductos {

    // La lista ordenada coloca cada producto segun su precio (compareTo)
    private ArrayOrderList<Producto> productos;

    public CatalogoProductos() {
        productos = new ArrayOrderList<>();
    }

    // Inserta el producto en la posicion que le corresponde por precio
    public void agregar(Producto producto) {
        productos.add(producto);
    }

    // Busca un producto por su ID. Devuelve null si no existe
    public Producto buscar(String id) {
        for (int i = 0; i < productos.size(); i++) {
            Producto actual = productos.get(i);
            if (actual.getId().equalsIgnoreCase(id)) {
                return actual;
            }
        }
        return null;
    }

    // Elimina un producto por su ID. Devuelve el producto eliminado o null
    public Producto eliminar(String id) {
        Producto encontrado = buscar(id);
        if (encontrado == null) {
            return null;
        }
        return productos.remove(encontrado);
    }

    public int total() {
        return productos.size();
    }

    public void mostrar() {
        System.out.println("CATÁLOGO ORDENADO POR PRECIO");
        if (productos.isEmpty()) {
            System.out.println("(sin productos)");
            return;
        }
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }
}
