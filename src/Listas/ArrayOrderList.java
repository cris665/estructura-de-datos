package Listas;

public class ArrayOrderList<T> extends ArrayList<T> implements OrderListADT<T> {

    @Override
    @SuppressWarnings("unchecked")
    public void add(T elemento) {
        if (size() == list.length) {
            expandCapacity();
        }
        Comparable<T> temp = (Comparable<T>) elemento;
        int scan = 0;
        while (scan < rear && temp.compareTo(list[scan]) > 0) {
            scan++;
        }
        for (int scan2 = rear; scan2 > scan; scan2--) {
            list[scan2] = list[scan2 - 1];
        }
        list[scan] = elemento;
        rear++;
    }

    public T get(int index) {
        if (index < 0 || index >= rear) {
            return null;
        }
        return list[index];
    }
}
