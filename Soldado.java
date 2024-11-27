public class Soldado {
    protected String nombre;
    protected int puntosDeVida;
    protected int fila,columna;
    protected int ejercito;
    protected static int numEjercitos=0;
    protected boolean vive=true;

    public Soldado(String nombre, int puntosDeVida, int fila, int columna,int ejercito) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.fila = fila;
        this.columna = columna;
        this.ejercito = ejercito;
    }

    public int getEjercito() {
        return ejercito;
    }

    public static void setNumEjercitos(int numEjercitos) {
        Soldado.numEjercitos = numEjercitos;
    }
    
    public static int getNumEjercitos() {
        return numEjercitos;
    }
    
    public void mover(int nuevaFila, int nuevaColumna) {
        this.fila = nuevaFila;
        this.columna = nuevaColumna;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void incrementarVida(int cantidad) {
        this.puntosDeVida += cantidad;
    }
    
    public void atacar(Soldado rival){
        int total=this.getPuntosDeVida()+rival.getPuntosDeVida();
        double prob=Math.random()*total;
        if (this.getPuntosDeVida() < rival.getPuntosDeVida()){
            if (prob <=(double) this.getPuntosDeVida()){
                rival.vive=false;
            } else
                this.vive=false;
        } else{
            if (prob <=(double) rival.getPuntosDeVida()){
                this.vive=false;
            } else
                rival.vive=false;
        }
    }
    
    @Override
    public String toString() {
        return "Soldado{" +
               "nombre='" + nombre + '\'' +
               ", puntosDeVida=" + puntosDeVida +
               ", posición=(" + fila + ", " + columna + ")" +
               '}';
    }
}
