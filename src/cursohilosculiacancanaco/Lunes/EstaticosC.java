package cursohilosculiacancanaco.Lunes;

public class EstaticosC {

    int control;
    String nombre;
    static String escuela = "ITL";

    static void cambio() {
        escuela = "ITR";
    }

    EstaticosC(int c, String n) {
        control = c;
        nombre = n;
    }

    void mostrar() {
        System.out.println(control + " " + nombre + " " + escuela);
    }

    public static void main(String[] args) {
        EstaticosC.cambio();

        EstaticosC c1 = new EstaticosC(1, "Fernanda");
        EstaticosC c2 = new EstaticosC(1, "Francisco");
        EstaticosC c3 = new EstaticosC(1, "Ferro");

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
    }
}


















