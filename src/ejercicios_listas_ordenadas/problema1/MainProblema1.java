package ejercicios_listas_ordenadas.problema1;

public class MainProblema1 {

    public static void main(String[] args) {
        CatalogoProductos catalogo = new CatalogoProductos();

        // 1. Insertar ocho productos en un orden distinto al de sus precios
        catalogo.agregar(new Producto("P001", "Monitor", 1800.00));
        catalogo.agregar(new Producto("P002", "Teclado", 250.00));
        catalogo.agregar(new Producto("P003", "Laptop", 12500.00));
        catalogo.agregar(new Producto("P004", "Cable USB", 80.00));
        catalogo.agregar(new Producto("P005", "Silla gamer", 3200.00));
        catalogo.agregar(new Producto("P006", "Audífonos", 450.00));
        catalogo.agregar(new Producto("P007", "Mouse", 150.00));
        catalogo.agregar(new Producto("P008", "Webcam", 600.00));

        // 2. Mostrar el catalogo: debe salir de menor a mayor precio
        catalogo.mostrar();
        System.out.println("Total de productos: " + catalogo.total());

        // 3. Buscar productos por ID
        System.out.println("\nBÚSQUEDA DE PRODUCTOS");
        buscar(catalogo, "P006");
        buscar(catalogo, "P099");

        // 4. Eliminar productos por ID
        System.out.println("\nELIMINACIÓN DE PRODUCTOS");
        eliminar(catalogo, "P002");
        eliminar(catalogo, "P050");

        // 5. Mostrar el catalogo despues de eliminar
        System.out.println();
        catalogo.mostrar();
        System.out.println("Total de productos: " + catalogo.total());
    }

    private static void buscar(CatalogoProductos catalogo, String id) {
        Producto producto = catalogo.buscar(id);
        if (producto != null) {
            System.out.println("Buscar " + id + " -> Producto encontrado: " + producto);
        } else {
            System.out.println("Buscar " + id + " -> Producto no encontrado");
        }
    }

    private static void eliminar(CatalogoProductos catalogo, String id) {
        Producto eliminado = catalogo.eliminar(id);
        if (eliminado != null) {
            System.out.println("Eliminar " + id + " -> Producto eliminado: " + eliminado);
        } else {
            System.out.println("Eliminar " + id + " -> Producto no encontrado");
        }
    }
}
