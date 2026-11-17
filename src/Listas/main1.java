package Listas;

import java.util.Scanner;

public class main1 {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayOrderList<Producto> catalogo = new ArrayOrderList<>();
    private static ArrayOrderList<Incidencia> incidencias = new ArrayOrderList<>();

    public static void main(String[] args) {
        int opcionMain = 0;

        do {
            System.out.println("\n==========================================");
            System.out.println("          SISTEMA DE GESTIÓN              ");
            System.out.println("==========================================");
            System.out.println("1. Módulo de Catálogo de Productos");
            System.out.println("2. Módulo de Incidencias de Soporte");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcionMain = Integer.parseInt(scanner.nextLine());
                switch (opcionMain) {
                    case 1:
                        menuProductos();
                        break;
                    case 2:
                        menuIncidencias();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido.");
            }
        } while (opcionMain != 3);
    }

    private static void menuProductos() {
        int opcion = 0;
        do {
            System.out.println("\n------------------------------------------");
            System.out.println("       MENÚ: CATÁLOGO DE PRODUCTOS        ");
            System.out.println("------------------------------------------");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Buscar producto por ID");
            System.out.println("3. Eliminar producto por ID");
            System.out.println("4. Mostrar catálogo ordenado por precio");
            System.out.println("5. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        agregarProducto();
                        break;
                    case 2:
                        buscarProducto();
                        break;
                    case 3:
                        eliminarProducto();
                        break;
                    case 4:
                        mostrarCatalogo();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un valor numérico.");
            }
        } while (opcion != 5);
    }

    private static void agregarProducto() {
        System.out.print("Ingresa el ID del producto (ej. P001): ");
        String id = scanner.nextLine().trim();

        System.out.print("Ingresa el nombre del producto: ");
        String nombre = scanner.nextLine().trim();

        System.out.print("Ingresa el precio: ");
        double precio = Double.parseDouble(scanner.nextLine().trim());

        catalogo.add(new Producto(id, nombre, precio));
        System.out.println("-> Producto agregado y ubicado dinámicamente según su precio.");
    }

    private static void buscarProducto() {
        System.out.print("Ingresa el ID del producto a buscar: ");
        String id = scanner.nextLine().trim();

        boolean encontrado = false;
        for (int i = 0; i < catalogo.size(); i++) {
            Producto p = catalogo.get(i);
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("Producto encontrado: " + p);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        System.out.print("Ingresa el ID del producto a eliminar: ");
        String id = scanner.nextLine().trim();

        Producto objetivo = null;
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getId().equalsIgnoreCase(id)) {
                objetivo = catalogo.get(i);
                break;
            }
        }

        if (objetivo != null) {
            catalogo.remove(objetivo);
            System.out.println("-> Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }
        System.out.println("\nCATÁLOGO ORDENADO POR PRECIO (Menor a Mayor)");
        System.out.println("------------------------------------------");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println(catalogo.get(i));
        }
    }

    private static void menuIncidencias() {
        int opcion = 0;
        do {
            System.out.println("\n------------------------------------------");
            System.out.println("       MENÚ: INCIDENCIAS DE SOPORTE       ");
            System.out.println("------------------------------------------");
            System.out.println("1. Registrar nueva incidencia");
            System.out.println("2. Mostrar incidencias ordenadas por prioridad");
            System.out.println("3. Volver al menú principal");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        agregarIncidencia();
                        break;
                    case 2:
                        mostrarIncidencias();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un valor numérico.");
            }
        } while (opcion != 3);
    }

    private static void agregarIncidencia() {
        System.out.print("Ingresa el N.º de incidencia: ");
        int numero = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Ingresa la descripción breve: ");
        String descripcion = scanner.nextLine().trim();

        System.out.println("Selecciona la prioridad:");
        System.out.println("1. ALTA");
        System.out.println("2. MEDIA");
        System.out.println("3. BAJA");
        System.out.print("Opción (1-3): ");
        int prioOp = Integer.parseInt(scanner.nextLine().trim());

        Incidencia.Prioridad prioridad;
        switch (prioOp) {
            case 1: prioridad = Incidencia.Prioridad.ALTA; break;
            case 2: prioridad = Incidencia.Prioridad.MEDIA; break;
            case 3: prioridad = Incidencia.Prioridad.BAJA; break;
            default:
                System.out.println("Opción inválida. Incidencia no registrada.");
                return;
        }

        incidencias.add(new Incidencia(numero, descripcion, prioridad));
        System.out.println("-> Incidencia registrada y ordenada por prioridad y número.");
    }

    private static void mostrarIncidencias() {
        if (incidencias.isEmpty()) {
            System.out.println("No hay incidencias registradas.");
            return;
        }
        System.out.println("\nINCIDENCIAS DE SOPORTE (Mayor a Menor Prioridad)");
        System.out.println("------------------------------------------");
        System.out.printf("%-8s %-28s %-10s\n", "N.º", "Descripción", "Prioridad");
        System.out.println("------------------------------------------");
        for (int i = 0; i < incidencias.size(); i++) {
            System.out.println(incidencias.get(i));
        }
    }
}

