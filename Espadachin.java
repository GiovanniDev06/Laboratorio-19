<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio19fp2;

/**
 *
 * @author Giovanni
 */
public class Espadachin extends Soldado{

    public Espadachin(String nombre, int numEjercito) {
        super(nombre, numEjercito);
    }
    
}
=======
public class Espadachin extends Soldado {
    private int longitudDeEspada;
    
    public Espadachin(String nombre, int puntosDeVida, int fila, int columna, int longitudDeEspada) {
        super(nombre, puntosDeVida, fila, columna);
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
    

>>>>>>> 94c307e (Reemplazando la cadena principal)
