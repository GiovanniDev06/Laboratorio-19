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
public class Caballero extends Soldado{

    public Caballero(String nombre, int numEjercito) {
        super(nombre, numEjercito);
    }
    
    
=======
public class Caballero extends Soldado {
    private String armaActual;
    private boolean montado;

    public Caballero(String nombre, int puntosDeVida, int fila, int columna) {
        super(nombre, puntosDeVida, fila, columna);
        this.armaActual = "espada";
        this.montado = false;
    }

    public void montar() {
        if (!montado) {
            montado = true;
            armaActual = "lanza";
            System.out.println(nombre + " se ha montado y ahora usa una lanza.");
        } else {
            System.out.println(nombre + " ya está montado.");
        }
    }

    public void desmontar() {
        if (montado) {
            montado = false;
            armaActual = "espada";
            System.out.println(nombre + " se ha desmontado y ahora usa una espada.");
        } else {
            System.out.println(nombre + " ya está desmontado.");
        }
    }

    public void envestir() {
        int ataques = montado ? 3 : 2;
        System.out.println(nombre + " realiza " + ataques + " ataques con su " + armaActual + ".");
    }

    @Override
    public String toString() {
        return "Caballero{" +
               "nombre='" + nombre + '\'' +
               ", puntosDeVida=" + puntosDeVida +
               ", posición=(" + fila + ", " + columna + ")" +
               ", armaActual='" + armaActual + '\'' +
               ", montado=" + montado +
               '}';
    }
>>>>>>> 94c307e (Reemplazando la cadena principal)
}
