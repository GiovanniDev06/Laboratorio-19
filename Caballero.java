package laboratorio19fp2;

public class Caballero extends Soldado{
    private String arma="espada", estado="desmontar";
    
    public Caballero(String nombre, int numEjercito) {
        super(nombre, numEjercito);
        this.nivelVida=(int)Math.round(Math.random()*3+3);
        this.vidaActual=this.nivelVida;
    }
    
    private void cambiarArma(){
        if (this.arma=="espada")
            this.arma="lanza";
        else
            this.arma="espada";
    }
    
    private void envestir(Soldado rival){
        this.atacar(rival);
        if (rival.isVive() && this.isVive()){
            this.atacar(rival);
        }
    }
    
    private void montar(){
        
    }
}
