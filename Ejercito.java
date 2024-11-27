import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercito {
    private static final Random random = new Random();
    private final List<Soldado> soldados;

    public Ejercito() {
        this.soldados = new ArrayList<>();
        generarSoldados();
    }

    private void generarSoldados() {
        int cantidadSoldados = random.nextInt(10) + 1; // Entre 1 y 10 soldados
        for (int i = 0; i < cantidadSoldados; i++) {
            int tipoSoldado = random.nextInt(3); // 0: Espadachin, 1: Arquero, 2: Caballero
            String nombre = generarNombre(tipoSoldado, i);
            int fila = random.nextInt(10); // Coordenadas aleatorias entre 0 y 9
            int columna = random.nextInt(10);

            switch (tipoSoldado) {
                case 0: // Espadachin
                    soldados.add(new Espadachin(nombre, random.nextInt(2) + 3, fila, columna, random.nextInt(50) + 50));
                    break;
                case 1: // Arquero
                    soldados.add(new Arquero(nombre, random.nextInt(3) + 1, fila, columna, random.nextInt(10) + 5));
                    break;
                case 2: // Caballero
                    soldados.add(new Caballero(nombre, random.nextInt(3) + 3, fila, columna));
                    break;
            }
        }
    }

    private String generarNombre(int tipo, int indice) {
        String tipoSoldado = switch (tipo) {
            case 0 -> "Espadachin";
            case 1 -> "Arquero";
            case 2 -> "Caballero";
            default -> "Soldado";
        };
        return tipoSoldado + "X" + indice;
    }

    public List<Soldado> getSoldados() {
        return soldados;
    }
}
