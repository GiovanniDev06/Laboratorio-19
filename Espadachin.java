public class Espadachin extends Soldado {
    private int longitudDeEspada;

    public Espadachin(int longitudDeEspada, String nombre, int puntosDeVida, int fila, int columna, int ejercito) {
        super(nombre, puntosDeVida, fila, columna, ejercito);
        this.longitudDeEspada = longitudDeEspada;
    }
    
    public void crearMuroDeEscudos() {
        System.out.println(nombre + " está creando un muro de escudos.");
    }
    
    @Override
    public String toString() {
        return "Espadachin{" +
                "nombre='" + nombre + '\'' +
                ", puntosDeVida=" + puntosDeVida +
                ", posición=(" + fila + ", " + columna + ")" +
                ", longitudDeEspada=" + longitudDeEspada +
                '}';
    }
}
    

