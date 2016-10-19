package cursohilosculiacancanaco.Lunes;

public class ThisCallM {

    int id;
    String nombre;
    String ciudad;

    public ThisCallM(int id, String nombre) {

        this.id = id;
        this.nombre = nombre;
    }

    public ThisCallM(int id, String nombre, String ciudad) {
        this(id, nombre);
        this.ciudad = ciudad;
    }

    void mostrat() {
        System.out.println(id + " " + nombre + " " + ciudad);
    }

    public static void main(String[] args) {
        ThisCallM t1 = new ThisCallM(1, "Fernanda");
        ThisCallM t2 = new ThisCallM(2, "Victor", "Leon");

        t1.mostrat();
        t2.mostrat();
    }

}
