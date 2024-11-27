import java.util.*;
public class Tablero {
    private final String[][] tablero;
    private final int filas = 10;
    private final int columnas = 10;

    public Tablero() {
        tablero = new String[filas][columnas];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = "-"; // Espacios vacíos
            }
        }
    }

    public void colocarEjercito(Ejercito ejercito, String idEjercito) {
        for (Soldado soldado : ejercito.getSoldados()) {
            int fila = soldado.fila;
            int columna = soldado.columna;

            if (tablero[fila][columna].equals("-")) {
                tablero[fila][columna] = idEjercito + obtenerTipoSoldado(soldado);
            } else {
                System.out.println("Conflicto en posición (" + fila + ", " + columna + "). Reubicando...");
                reubicarSoldado(soldado, idEjercito);
            }
        }
    }

    private void reubicarSoldado(Soldado soldado, String idEjercito) {
        Random random = new Random();
        int nuevaFila, nuevaColumna;
        do {
            nuevaFila = random.nextInt(filas);
            nuevaColumna = random.nextInt(columnas);
        } while (!tablero[nuevaFila][nuevaColumna].equals("-"));

        soldado.mover(nuevaFila, nuevaColumna);
        tablero[nuevaFila][nuevaColumna] = idEjercito + obtenerTipoSoldado(soldado);
    }

    private String obtenerTipoSoldado(Soldado soldado) {
        if (soldado instanceof Espadachin) return "E";
        if (soldado instanceof Arquero) return "A";
        if (soldado instanceof Caballero) return "C";
        return "S"; // Por defecto
    }

    public void mostrarTablero() {
        for (String[] fila : tablero) {
            for (String celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }
}
