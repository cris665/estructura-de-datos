package Recursividad;

public class Recursiva {
    
    public int sumar(int num){
        int resultado;

        if (num<=1) {
            resultado=num;
        }else{
            resultado=num+sumar(num-1);

        }
        return resultado;
    }

    public int multiplicar(int n){
        int total;
        if (n<=1) {
            total=1;
        }else{
            total= n*multiplicar(n-1);
        }
        return total;
    }

    // mismo calculo que multiplicar(), se conserva el nombre que ya usabas
    public int factorial(int num){
        return multiplicar(num);
    }
}
