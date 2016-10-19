package cursohilosculiacancanaco.Martes;
//Herencia si, sobreescritura no
public class FinalEjemploS1 {

    final void run() {
        System.out.println("Corriendo...");
    }
}

class Benotto extends FinalEjemploS1 {

    public static void main(String[] args) {
        new Benotto().run();
    }
}
