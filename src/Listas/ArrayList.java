package Listas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author user
 */
public class ArrayList<T> implements ListADT<T> {

    protected final int NOT_FOUND = -1;
    protected int rear;
    protected T[] list;
    private final int DEFAULT_CAPACITY = 50;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        rear = 0;
        list = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("list");
        }
        return removeAt(0);
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("list");
        }
        return removeAt(rear - 1);
    }

    @Override
    public T remove(T element) {
        int index = find(element);
        if (index == NOT_FOUND) {
            throw new NoSuchElementException("list");
        }
        return removeAt(index);
    }

    // elimina el elemento de la posicion indicada y recorre los demas
    protected T removeAt(int index) {
        T result = list[index];
        rear--;
        //deplazar los elemento
        for (int scan = index; scan < rear; scan++) {
            list[scan] = list[scan + 1];
        }
        list[rear] = null;
        return result;
    }

    protected int find(T element) {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;
        if (!isEmpty() && element != null) {
            while (!found && scan < rear) {
                if (element.equals(list[scan])) {
                    found = true;
                } else {
                    scan++;
                }
            }
        }
        if (found) {
            result = scan;
        }
        return result;
    }

    // duplica el tamaño del arreglo cuando se llena
    @SuppressWarnings("unchecked")
    protected void expandCapacity() {
        T[] larger = (T[]) (new Object[list.length * 2]);
        for (int index = 0; index < list.length; index++) {
            larger[index] = list[index];
        }
        list = larger;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("list");
        }
        return list[0];
    }

    @Override
    public T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("list");
        }
        return list[rear - 1];
    }

    @Override
    public boolean contains(T target) {
        return find(target) != NOT_FOUND;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return rear;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < rear;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                current++;
                return list[current - 1];
            }
        };
    }

    @Override
    public String toString() {
        String lista = "";
        for (int i = 0; i < rear; i++) {
            lista = lista + list[i] + "|";
        }
        return lista;
    }
}
