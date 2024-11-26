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
    }

    public String getNombre() {
        return nombre;
    }

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
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", actitud=" + actitud + 
                ", nivelAtaque=" + nivelAtaque + ",\n nivelDefensa=" + nivelDefensa 
                + ", nivelVida=" + nivelVida + ", vidaActual=" + vidaActual 
                + ",\n velocidad=" + velocidad + ", numEjercito=" + numEjercito + '}';
    }
}
