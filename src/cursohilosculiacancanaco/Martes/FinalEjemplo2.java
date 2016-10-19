package cursohilosculiacancanaco.Martes;

public class FinalEjemplo2 {

    /* final */ void run() {
        System.out.println("correr");
    }
}

class Marca extends FinalEjemplo2 {

    //Tampoco podemos sobreescribir metodos
    void run() {
        System.out.println("No se puede sobreescribir");
    }

    public static void main(String[] args) {
        Marca marca = new Marca();
        marca.run();
    }
}
