package Listas;

/**
 * UnorderListADT: lista desordenada, el usuario decide dónde va cada elemento.
 */
public interface UnorderListADT<T> extends ListADT<T> {

    public void addToFront(T element);

    public void addtoRear(T element);

    public void addAfter(T element, T target);
}
