package laboratorio19fp2;

public class Espadachin extends Soldado{
    private int longitudEspada;
    
    public Espadachin(String nombre, int numEjercito) {
        super(nombre, numEjercito);
        this.nivelVida=(int)Math.round(Math.random()*2+3);
        this.vidaActual=this.nivelVida;
    }
    
}
