<<<<<<< HEAD
package laboratorio19fp2;

public class Soldado {
    private String nombre,actitud="";
    private int nivelAtaque,nivelDefensa,nivelVida,vidaActual,velocidad,
            fil,col,numEjercito;
    private static int cantSoldados;
    public Soldado(String nombre,int numEjercito){
        this.nombre=nombre;
        this.numEjercito=numEjercito;
        nivelAtaque=(int)Math.round(Math.random()*5+1);
        nivelDefensa=(int)Math.round(Math.random()*5+1);
        velocidad=(int)Math.round(Math.random()*5+1);
        cantSoldados++;
=======
public class Soldado {
    protected String nombre;
    protected int puntosDeVida;
    protected int fila;
    protected int columna;

    public Soldado(String nombre, int puntosDeVida, int fila, int columna) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.fila = fila;
        this.columna = columna;
    }

    public void mover(int nuevaFila, int nuevaColumna) {
        this.fila = nuevaFila;
        this.columna = nuevaColumna;
>>>>>>> 94c307e (Reemplazando la cadena principal)
    }

    public String getNombre() {
        return nombre;
    }

<<<<<<< HEAD
    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getFil() {
        return fil;
    }

    public int getCol() {
        return col;
    }

    public int getNumEjercito() {
        return numEjercito;
    }
    
    public static int getCantSoldados() {
        return cantSoldados;
=======
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void incrementarVida(int cantidad) {
        this.puntosDeVida += cantidad;
>>>>>>> 94c307e (Reemplazando la cadena principal)
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Soldado{" + "nombre=" + nombre + ", actitud=" + actitud + 
                ", nivelAtaque=" + nivelAtaque + ",\n nivelDefensa=" + nivelDefensa 
                + ", nivelVida=" + nivelVida + ", vidaActual=" + vidaActual 
                + ",\n velocidad=" + velocidad + ", numEjercito=" + numEjercito + '}';
=======
        return "Soldado{" +
               "nombre='" + nombre + '\'' +
               ", puntosDeVida=" + puntosDeVida +
               ", posición=(" + fila + ", " + columna + ")" +
               '}';
>>>>>>> 94c307e (Reemplazando la cadena principal)
    }
}
