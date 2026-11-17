package Listas;

/**
 *
 * @author user
 */
public class ArrayIndexList<T> extends ArrayList<T> implements IndexListADT<T> {

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > rear) {
            throw new IndexOutOfBoundsException("Indice: " + index + ", tamaño: " + rear);
        }
        if (size() == list.length) {
            expandCapacity();
        }
        for (int scan = rear; scan > index; scan--) {
            list[scan] = list[scan - 1];
        }
        list[index] = element;
        rear++;
    }

    @Override
    public void set(int index, T element) {
        checkIndex(index);
        list[index] = element;
    }

    @Override
    public void add(T element) {
        add(rear, element);
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return list[index];
    }

    @Override
    public int indexOf(T element) {
        return find(element);
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        return removeAt(index);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= rear) {
            throw new IndexOutOfBoundsException("Indice: " + index + ", tamaño: " + rear);
        }
    }
}
