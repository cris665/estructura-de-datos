package Recursividad.actividad02;

public class Palabra {
    private String texto;

    public Palabra(String texto) {
        this.texto = texto;
    }

    public int contarVocales() {
        return contarVocalesRecursivo(this.texto, 0);
    }

    private int contarVocalesRecursivo(String str, int indice) {
        // Caso base: cuando alcanzamos el final de la cadena
        if (indice >= str.length()) {
            return 0;
        }

        char c = Character.toLowerCase(str.charAt(indice));
        int esVocal = ("aeiouáéíóúü".indexOf(c) >= 0) ? 1 : 0;

        // Paso recursivo
        return esVocal + contarVocalesRecursivo(str, indice + 1);
    }

    public String invertir() {
        return invertirRecursivo(this.texto, this.texto.length() - 1);
    }

    private String invertirRecursivo(String str, int indice) {
        // Caso base: índice menor a 0 o texto vacío
        if (indice < 0) {
            return "";
        }

        // Paso recursivo
        return str.charAt(indice) + invertirRecursivo(str, indice - 1);
    }
    
}
