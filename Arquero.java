public class Arquero extends Soldado {
    private int numeroDeFlechas;

    public Arquero(int numeroDeFlechas, String nombre, int puntosDeVida, int fila, int columna, int ejercito) {
        super(nombre, puntosDeVida, fila, columna, ejercito);
        this.numeroDeFlechas = numeroDeFlechas;
    }

    public void dispararFlecha() {
        if (numeroDeFlechas > 0) {
            numeroDeFlechas--;
            System.out.println(nombre + " disparó una flecha. Flechas restantes: " + numeroDeFlechas);
        } else {
            System.out.println(nombre + " no tiene flechas disponibles.");
        }
    }

    @Override
    public String toString() {
        return "Arquero{" +
               "nombre='" + nombre + '\'' +
               ", puntosDeVida=" + puntosDeVida +
               ", posición=(" + fila + ", " + columna + ")" +
               ", numeroDeFlechas=" + numeroDeFlechas +
               '}';
    }
}
