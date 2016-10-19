package cursohilosculiacancanaco.Martes;
//Super provisto por compilacion implicita

public class EjemploSuper4 {

    EjemploSuper4() {
        System.out.println("Se crea el vehiculo");
    }
}

class Bicicleta5 extends EjemploSuper4 {

    int velocidad;

    Bicicleta5(int velocidad) {
        this.velocidad = velocidad;
        System.out.println(velocidad);
    }

    public static void main(String[] args) {
        Bicicleta5 bici5 = new Bicicleta5(10);
    }

}
