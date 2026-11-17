
package Listas;


public class Main {
    public static void main(String[] args) {
       
        ArrayOrderList<Integer> lista= new ArrayOrderList<>();

        System.out.println(lista);
        lista.add(5);
        lista.add(3);
        lista.add(20);
        lista.add(32);
        lista.add(18);
        lista.add(6);
        lista.add(100);
        lista.add(-2);


        System.out.println(lista);

        lista.removeFirst();
        System.out.println(lista);
        lista.removeLast();
        System.out.println(lista);
         lista.add(64);
        System.out.println(lista);

    }
    
}
