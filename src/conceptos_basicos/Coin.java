package conceptos_basicos;

public class Coin {

    private final int HEADS=0;
    private final int TAILS=1;
    private int face;
    
    public Coin(){
        this.flip();
    }

    public final void flip(){

        face = (int)(Math.random()*2);
    }

    public boolean isHEADS(){
        return(face==HEADS);
    }

    @Override
    public String toString(){
        String faceName;
        if (face==TAILS) {
            faceName="Cruz Gano";
        }else{
            faceName="Cara Gano";
        }
        return faceName;
    }


    
}
