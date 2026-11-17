package conceptos_basicos.Herencia;

public class Dictionary extends Book {

    private int numDef;

    public Dictionary(int numPages, int numDef) {
        super(numPages);
        this.numDef = numDef;
    }
    
    public void info(){
        System.out.println("Number of  definitions: " + numDef);
        System.out.println("Number of Pages: " + numPages);
    }
    
}
