public class Main {
    public static void main(String[] args) {
        Ejercito ejercito1 = new Ejercito();
        Ejercito ejercito2 = new Ejercito();

        Tablero tablero = new Tablero();

        tablero.colocarEjercito(ejercito1, "1");
        tablero.colocarEjercito(ejercito2, "2");

        System.out.println("Estado inicial del tablero:");
        tablero.mostrarTablero();

        System.out.println("\nEjército 1:");
        ejercito1.getSoldados().forEach(System.out::println);

        System.out.println("\nEjército 2:");
        ejercito2.getSoldados().forEach(System.out::println);
    }
}