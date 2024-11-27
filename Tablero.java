import java.util.*;

public class Tablero {
    private final String[][] tablero;
    private final int filas = 10;
    private final int columnas = 10;

    private Ejercito ejercito1; // Referencia al Ejército 1
    private Ejercito ejercito2; // Referencia al Ejército 2

    public Tablero() {
        tablero = new String[filas][columnas];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = "-"; 
            }
        }
    }

    public void colocarEjercitos(Ejercito ejercito1, Ejercito ejercito2) {
        this.ejercito1 = ejercito1; // Asignar los ejércitos
        this.ejercito2 = ejercito2; // Asignar los ejércitos
    
        colocarEjercito(ejercito1, "1"); // Colocar Ejército 1 en el tablero
        colocarEjercito(ejercito2, "2"); // Colocar Ejército 2 en el tablero
    }

    private void colocarEjercito(Ejercito ejercito, String idEjercito) {
        for (Soldado soldado : ejercito.getSoldados()) {
            int fila = soldado.fila;
            int columna = soldado.columna;

            if (tablero[fila][columna].equals("-")) {
                tablero[fila][columna] = idEjercito + obtenerTipoSoldado(soldado);
            } else {
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
        return "S"; 
    }

    public void mostrarTablero() {
        for (String[] fila : tablero) {
            for (String celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    public boolean esMovimientoValido(Soldado soldado, int nuevaFila, int nuevaColumna) {
        return nuevaFila >= 0 && nuevaFila < filas &&
               nuevaColumna >= 0 && nuevaColumna < columnas &&
               (tablero[nuevaFila][nuevaColumna].equals("-") || !tablero[nuevaFila][nuevaColumna].startsWith("1"));
    }
    
    public Soldado obtenerSoldadoEnPosicion(int fila, int columna) {
        // Busca un soldado en la posición dada
        for (Soldado soldado : ejercito1.getSoldados()) {
            if (soldado.fila == fila && soldado.columna == columna) {
                return soldado;
            }
        }
        for (Soldado soldado : ejercito2.getSoldados()) {
            if (soldado.fila == fila && soldado.columna == columna) {
                return soldado;
            }
        }
        return null;
    }
    
    public void moverSoldado(Soldado soldado, int nuevaFila, int nuevaColumna) {
        tablero[soldado.fila][soldado.columna] = "-"; // Limpia la posición actual
        tablero[nuevaFila][nuevaColumna] = "1" + obtenerTipoSoldado(soldado); // Actualiza la nueva posición
        soldado.mover(nuevaFila, nuevaColumna);
    }

    public void limpiarPosicion(int fila, int columna) {
        tablero[fila][columna] = "-";
    }
}
