public class Personaje {
    private String nom;
    private int dinero;

    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }

    // GETTERS
    public String getNombre() {
        return nom;
    }

    public int getDinero() {
        return dinero;
    }

    // SETTER
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");
    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();

        // Aquí usamos la función de gastar dinero
        GestionDinero.gastarDinero(jugador, 100);

        jugador.mostrarInfo();
    }
}
