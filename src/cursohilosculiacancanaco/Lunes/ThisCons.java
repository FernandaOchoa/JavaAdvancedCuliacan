package cursohilosculiacancanaco.Lunes;

public class ThisCons {

    int id;
    String nombre;

    public ThisCons() {
        System.out.println("Constructor por default");
    }

    public ThisCons(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String[] args) {
        ThisCons t1 = new ThisCons(1, "Alan");
        ThisCons t2 = new ThisCons(2, "Brenda");
        
        t1.mostrar();
        t2.mostrar();
    }

}
