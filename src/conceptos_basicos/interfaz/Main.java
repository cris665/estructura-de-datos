package conceptos_basicos.interfaz;

public class Main {
    public static void main(String[] args) {
        Suma s = new Suma();

        s.sumar(5, 8);
        System.out.println(s.resultado());
    }
}
