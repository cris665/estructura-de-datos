package ejercicios_listas_ordenadas.problema2;

import Listas.ArrayOrderList;

public class MainProblema2 {

    public static void main(String[] args) {
        ArrayOrderList<Incidencia> incidencias = new ArrayOrderList<>();

        // 1. Insertar ocho incidencias en orden aleatorio
        incidencias.add(new Incidencia(108, Prioridad.BAJA, "Ajuste de interfaz"));
        incidencias.add(new Incidencia(103, Prioridad.MEDIA, "Fallo de validación"));
        incidencias.add(new Incidencia(105, Prioridad.ALTA, "Error de autenticación"));
        incidencias.add(new Incidencia(101, Prioridad.ALTA, "Servicio no disponible"));
        incidencias.add(new Incidencia(107, Prioridad.MEDIA, "Reporte con datos erróneos"));
        incidencias.add(new Incidencia(102, Prioridad.BAJA, "Texto mal alineado"));
        incidencias.add(new Incidencia(106, Prioridad.ALTA, "Caída de base de datos"));
        incidencias.add(new Incidencia(104, Prioridad.MEDIA, "Correo no enviado"));

        // 2. Mostrar: primero las de mayor prioridad
        mostrar("INCIDENCIAS DE SOPORTE", incidencias);

        // 3. Agregar dos incidencias mas y comprobar que el orden se conserva
        incidencias.add(new Incidencia(110, Prioridad.ALTA, "Pago rechazado"));
        incidencias.add(new Incidencia(109, Prioridad.BAJA, "Cambio de logotipo"));
        mostrar("DESPUÉS DE AGREGAR LAS INCIDENCIAS 110 Y 109", incidencias);

        // 4. Pruebas del criterio de comparacion
        System.out.println("\nPRUEBAS DEL CRITERIO DE ORDENAMIENTO");
        probar(new Incidencia(205, Prioridad.ALTA, "A"), new Incidencia(201, Prioridad.BAJA, "B"));
        probar(new Incidencia(201, Prioridad.MEDIA, "A"), new Incidencia(205, Prioridad.ALTA, "B"));
        probar(new Incidencia(201, Prioridad.MEDIA, "A"), new Incidencia(205, Prioridad.MEDIA, "B"));
        probar(new Incidencia(205, Prioridad.BAJA, "A"), new Incidencia(201, Prioridad.BAJA, "B"));
    }

    private static void mostrar(String titulo, ArrayOrderList<Incidencia> lista) {
        System.out.println("\n" + titulo);
        System.out.printf("%-6s %-28s %s%n", "N.º", "Descripción", "Prioridad");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("Total: " + lista.size() + " | Orden correcto: " + estaOrdenada(lista));
    }

    // Revisa que cada incidencia vaya antes que la siguiente segun compareTo
    private static boolean estaOrdenada(ArrayOrderList<Incidencia> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i).compareTo(lista.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    // Indica cual de las dos incidencias se atiende primero
    private static void probar(Incidencia a, Incidencia b) {
        Incidencia primera = (a.compareTo(b) <= 0) ? a : b;
        System.out.printf("%d (%s) vs %d (%s) -> va primero la %d%n",
                a.getNumero(), a.getPrioridad(), b.getNumero(), b.getPrioridad(), primera.getNumero());
    }
}
