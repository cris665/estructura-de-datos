package Listas;

import java.util.NoSuchElementException;

/**
 *
 * @author user
 */
public class ArrayUnorderList<T> extends ArrayList<T> implements UnorderListADT<T> {

    @Override
    public void addToFront(T element) {
        insertAt(0, element);
    }

    @Override
    public void addtoRear(T element) {
        insertAt(rear, element);
    }

    @Override
    public void addAfter(T element, T target) {
        int index = find(target);
        if (index == NOT_FOUND) {
            throw new NoSuchElementException("list");
        }
        insertAt(index + 1, element);
    }

    // abre un hueco en la posicion indicada y coloca el elemento
    private void insertAt(int index, T element) {
        if (size() == list.length) {
            expandCapacity();
        }
        for (int scan = rear; scan > index; scan--) {
            list[scan] = list[scan - 1];
        }
        list[index] = element;
        rear++;
    }
}
