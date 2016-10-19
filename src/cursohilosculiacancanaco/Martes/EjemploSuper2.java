package cursohilosculiacancanaco.Martes;

public class EjemploSuper2 {

    int velocidad = 50;
}

class Bicicleta3 extends EjemploSuper2 {

    int velocidad = 100;

    void mostrar() {
        System.out.println(super.velocidad);
    }

    public static void main(String[] args) {
        Bicicleta3 bici3 = new Bicicleta3();
        bici3.mostrar();
    }
}
