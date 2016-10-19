package cursohilosculiacancanaco.Lunes;

public class Constructores2 {

    int id;
    String nombre;

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String[] args) {
        Constructores2 c1 = new Constructores2(), c2 = new Constructores2();

        c1.mostrar();
        c2.mostrar();
    }

}
