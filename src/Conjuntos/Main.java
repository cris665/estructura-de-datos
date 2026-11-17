package Conjuntos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BarajaLoteria loteria = new BarajaLoteria();

        int opcion = 0;
        do {
            System.out.println("\n==========================================");
            System.out.println("      LOTERÍA MEXICANA (CONJUNTOS)       ");
            System.out.println("==========================================");
            System.out.println("1. Agregar carta manualmente");
            System.out.println("2. Cargar cartas tradicionales predefinidas");
            System.out.println("3. Sacar / 'Cantar' carta aleatoria");
            System.out.println("4. Ver total de cartas en el conjunto");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.print("Número de carta: ");
                        int num = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nombre de la carta: ");
                        String nombre = scanner.nextLine();
                        
                        if (loteria.agregarCarta(new Carta(num, nombre))) {
                            System.out.println("-> Carta agregada al conjunto.");
                        } else {
                            System.out.println("-> Ya existe una carta con el número " + num + " (no se admiten duplicados).");
                        }
                        break;

                    case 2:
                        loteria.cargarBarajaTradicional();
                        System.out.println("-> Baraja cargada con éxito. Cartas en el conjunto: " + loteria.cartasRestantes());
                        break;

                    case 3:
                        if (loteria.estaVacia()) {
                            System.out.println("-> El conjunto de cartas está vacío.");
                        } else {
                            Carta carta = loteria.sacarCartaAleatoria();
                            System.out.println("\n¡" + carta.getNombre().toUpperCase() + "! -> " + carta);
                            System.out.println("Cartas restantes en la baraja: " + loteria.cartasRestantes());
                        }
                        break;

                    case 4:
                        System.out.println("Cartas disponibles en el conjunto: " + loteria.cartasRestantes());
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un valor numérico válido.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
