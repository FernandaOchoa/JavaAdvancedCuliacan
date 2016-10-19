package cursohilosculiacancanaco.Martes;

public class FinalEjemplo4 {

    int cubo(/*final*/ int n) {
        n = n + 2; //No puede ser cambiado por que n es final
        n = n * n * n;
        return n;
    }

    public static void main(String[] args) {
        FinalEjemplo4 fe = new FinalEjemplo4();
        fe.cubo(5);
    }

}
