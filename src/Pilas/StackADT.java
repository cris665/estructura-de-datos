package Pilas;

public interface StackADT <T> {
    public  void push(T element); //Añade un elemento a la fila
    public  T pop(); //Elimina un elemento de la parte superior de la pila
    public T peek();//Examina el elemento situado en la parte superior de la pila
    public boolean isEmpty(); //Determina si la pila esta vacia 
    public int size(); //Determina el tamaño de la pila
    public String toString(); //Representa en forma de caracteres de la pila





}
