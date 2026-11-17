package Listas;

import java.util.Scanner;

public class JoshephusList {
    public static void main(String[] args) {
        int numpeople, gap, counter;

        // lista indexada: se elimina por POSICION, no por valor
        ArrayIndexList<Integer> list = new ArrayIndexList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of soldiers");
        numpeople = in.nextInt();
        in.nextLine();

        System.out.println("Enter the gap between soldiers");
        gap = in.nextInt();
        in.close();

        if (numpeople <= 0 || gap <= 0) {
            System.out.println("Both numbers must be greater than zero");
            return;
        }

        for (int count = 1; count <= numpeople; count++) {
            list.add(count);
        }

        counter = (gap - 1) % numpeople;

        System.out.println("The order list is: ");

        while (!(list.isEmpty())) {
            System.out.println(list.remove(counter));
            numpeople = numpeople - 1;
            if (numpeople > 0) {
                counter = (counter + gap - 1) % numpeople;
            }
        }
    }
}
