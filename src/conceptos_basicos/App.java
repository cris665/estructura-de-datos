package conceptos_basicos;
public class App {
    public static void main(String[] args) throws Exception {

        Coin volado= new Coin();
        System.out.println(volado);


        //Variables Primitivas : Se almacenan directamente en la memoria

        String name="Maria Garcia";

        System.out.println(name);

        int num1=5;
        int num2=12;

        num2=num1;
        num1=10;

        System.out.println( "El valor de  num1 : " + num1);
        System.out.println("El valor de  num2 : " + num2);

        //Variable de Objeto: Referencias de objeto y son las variables que se encuentran en una clase
        Numero n1 = new Numero();
        n1.numero=5;

        Numero n2= new Numero();
        n2.numero=12;

        n1=n2;
        
        n1.numero=10;

        System.out.println("*****Variables de Objeto*******" );
        System.out.println( "El valor de  n1 : " + n1.numero);
        System.out.println("El valor de  n2 : " + n2.numero);

        //Variables Estaticas:Pertenecen a la clase en si misma en lugar de instanciarla.

        System.out.println("*****Variables Estaticas*******" );
        System.out.println(Math.PI);

        Estaticas.count=50;
        Estaticas.incrementaCount(5);
        System.out.println("el valor de incrementacount: " + Estaticas.count );

    
        
    }
}
