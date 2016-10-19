package cursohilosculiacancanaco.Martes;

/*
FinalEjemplo = bicicletas
 */
public class FinalEjemplo {

    // final int limite = 90;
    void run() {
        int limite = 120;
        //No puede ser cambiado por que su valor es final
        //Una vez que se le ha asignado un valor este no puede ser modificado.
    }

    public static void main(String[] args) {
        FinalEjemplo objeto = new FinalEjemplo();
        objeto.run();
    }
}
