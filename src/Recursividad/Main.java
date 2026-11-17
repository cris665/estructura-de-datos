package Recursividad;

public class Main {
    public static void main(String[] args) {
        Recursiva r = new Recursiva();
        System.out.println(r.sumar(259));
        Recursiva m = new Recursiva();
        System.out.println(m.multiplicar(5));

        Maze n = new Maze();
        System.out.println(n);

        if (n.trasverse(0, 0)) {
            System.out.println("Termino");
            System.out.println(n); // muestra el camino (7)
        } else {
            System.out.println("No encontro camino");
        }

        
        TowerOfHanoi tower = new TowerOfHanoi(3);
        tower.solve();

    }
}
