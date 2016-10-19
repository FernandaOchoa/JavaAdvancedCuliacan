package cursohilosculiacancanaco.Martes;

abstract class Bici2 {

    Bici2() {
        System.out.println("Se ha creado una bicicleta");
    }

    abstract void run();

    void cambio() {
        System.out.println("Ha sido cambiado");
    }
}

class Marca4 extends Bici2 {

    void run() {
        System.out.println("Corriendo...");
    }
}

public class TestAbstract2 {

    public static void main(String[] args) {
        Bici2 obj = new Marca4();
        obj.run();
        obj.cambio();
    }

}
