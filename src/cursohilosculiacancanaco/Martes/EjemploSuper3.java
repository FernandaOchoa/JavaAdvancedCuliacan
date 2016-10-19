package cursohilosculiacancanaco.Martes;

//Super para invocar el constructor de la clase padre
//EjemploSuper3 = vehiculo
public class EjemploSuper3 {

    EjemploSuper3() {
        System.out.println("El vehiculo se creo");
    }
}

class Bicicleta4 extends EjemploSuper3  {

    Bicicleta4() {
       super();

        System.out.println("Bicicleta ha sido creada");
    }

    public static void main(String[] args) {

        Bicicleta4 bici4 = new Bicicleta4();

    }
}
