package cursohilosculiacancanaco.Martes;

public class Empleados {

    int id;
    String nombre;
    Direccion direccion;

    public Empleados(int id, String nombre, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    void mostrar() {
        System.out.println(id + " " + nombre);
        System.out.println(direccion.ciudad + " " + direccion.estado + " " + direccion.pais);
    }

    public static void main(String[] args) {
        Direccion dir1 = new Direccion("leon", "Guanajuato", "Mexico");
        Direccion dir2 = new Direccion("San Miguel ", "Guanajuato", "Mexico");

        Empleados e1 = new Empleados(1, "Uriel", dir1);
        Empleados e2 = new Empleados(2, "Francisco", dir2);

        e1.mostrar();
        e2.mostrar();
    }
}
