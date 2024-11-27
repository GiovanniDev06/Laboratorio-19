public class Espadachin extends Soldado {
    private int longitudDeEspada;
    
    public Espadachin(String nombre, int puntosDeVida, int fila, int columna, int longitudDeEspada) {
        super(nombre, puntosDeVida, fila, columna);
        this.longitudDeEspada = longitudDeEspada;
    }
    
    public void crearMuroDeEscudos() {
        System.out.println(nombre + " está creando un muro de escudos");
    }
    
    @Override
    public String toString() {
        return "Espadachin{" +
                "nombre='" + nombre + '\'' +
                ", puntosDeVida=" + puntosDeVida +
                ", posicion=(" + fila + ", " + columna + ")" +
                ", longitudDeEspada=" + longitudDeEspada +
                '}';
    }
}
    

