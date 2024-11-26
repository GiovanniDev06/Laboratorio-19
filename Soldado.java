package laboratorio19fp2;

public class Soldado {
    private String nombre,actitud="";
    private int nivelAtaque,nivelDefensa,velocidad,
            fil,col,numEjercito;
    protected int nivelVida,vidaActual;
    private boolean vive=true;
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
    
    public void morir(){
        if (this.vidaActual <= 0)
            this.vive=false;
    }
    
    public void atacar(Soldado rival){
        int total=this.getVidaActual()+rival.getVidaActual();
        int prob=(int)Math.round(Math.random()*total);
        if (this.getVidaActual() > rival.getVidaActual()){
            if (prob < rival.getVidaActual()){
                rival.vidaActual=0;
                rival.morir();
            } else {
                this.vidaActual=0;
                this.morir();
            }
        } else {
            if (prob < this.getVidaActual()){
                this.vidaActual=0;
                this.morir();
            } else {
                rival.vidaActual=0;
                rival.morir();
            }
        }
    }
    
    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", actitud=" + actitud + 
                ", nivelAtaque=" + nivelAtaque + ",\n nivelDefensa=" + nivelDefensa 
                + ", nivelVida=" + nivelVida + ", vidaActual=" + vidaActual 
                + ",\n velocidad=" + velocidad + ", numEjercito=" + numEjercito + '}';
    }
}
