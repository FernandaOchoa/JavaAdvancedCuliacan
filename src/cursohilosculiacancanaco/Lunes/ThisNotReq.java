package cursohilosculiacancanaco.Lunes;

public class ThisNotReq {

    int id;
    String nombre;

    ThisNotReq(int i, String n) {
        id = i;
        nombre = n;
    }

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String[] args) {
        ThisNotReq t1 = new ThisNotReq(1, "Selene");
        ThisNotReq t2 = new ThisNotReq(2, "Lizeth");

        t1.mostrar();
        t2.mostrar();
    }
}
