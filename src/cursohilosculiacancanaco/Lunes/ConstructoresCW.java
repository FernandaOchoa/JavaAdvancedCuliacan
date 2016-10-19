package cursohilosculiacancanaco.Lunes;

public class ConstructoresCW {

    int id;
    String nombre;

    ConstructoresCW(int i, String n) {
        id = i;
        nombre = n;
    }

    ConstructoresCW() {

    }

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String[] args) {
        ConstructoresCW c1 = new ConstructoresCW(1, "Fernanda");
        ConstructoresCW c2 = new ConstructoresCW();

        c2.id = c1.id;
        c2.nombre = c1.nombre;

        c1.mostrar();
        c2.mostrar();
    }

}
