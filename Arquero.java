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
public class Arquero extends Soldado{

    public Arquero(String nombre, int numEjercito) {
        super(nombre, numEjercito);
    }
    
    
=======
public class Arquero extends Soldado {
    private int numeroDeFlechas;

    public Arquero(String nombre, int puntosDeVida, int fila, int columna, int numeroDeFlechas) {
        super(nombre, puntosDeVida, fila, columna);
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
>>>>>>> 94c307e (Reemplazando la cadena principal)
}
