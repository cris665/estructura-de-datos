package ejercicios_listas_ordenadas.problema2;

// Tres niveles de prioridad. El nivel mas alto se atiende primero
public enum Prioridad {
    ALTA(3, "Alta"),
    MEDIA(2, "Media"),
    BAJA(1, "Baja");

    private final int nivel;
    private final String etiqueta;

    Prioridad(int nivel, String etiqueta) {
        this.nivel = nivel;
        this.etiqueta = etiqueta;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return etiqueta;
    }
}
