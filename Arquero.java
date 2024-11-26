package laboratorio19fp2;

public class Arquero extends Soldado{
    private int cantFlechas=20;
    
    public Arquero(String nombre, int numEjercito) {
        super(nombre, numEjercito);
        this.nivelVida=(int)Math.round(Math.random()*3+1);
        this.vidaActual=this.nivelVida;
    }
    
    
}
