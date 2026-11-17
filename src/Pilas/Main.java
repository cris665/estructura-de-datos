package Pilas;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> pila = new ArrayStack<>();

        pila.push(5);
        pila.push(10);
        System.out.println(pila);
        System.out.println(pila.pop());
    }
}
