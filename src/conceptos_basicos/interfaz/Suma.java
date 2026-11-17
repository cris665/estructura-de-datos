package conceptos_basicos.interfaz;

public class Suma  implements ISuma {

    private int resultado;
    @Override
    public int resultado() {
       
        return resultado;
    }

    @Override
    public void sumar(int a, int b) {
      resultado=a+b;  
        
    }
    
    
}
