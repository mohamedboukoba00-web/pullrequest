public class GestionDinero {

    public static void gastarDinero(Personaje p, int cantidad) {
        if (cantidad > p.getDinero()) {
            System.out.println(p.getNombre() + " no tiene suficiente dinero.");
        } else {
            p.setDinero(p.getDinero() - cantidad);
            System.out.println(p.getNombre() + " gasta " + cantidad + "$ en ropa nueva.");
        }
    }
}
