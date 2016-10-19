package cursohilosculiacancanaco.Martes;

public class HAgregacion {

    int square(int n) {
        return n * n;
    }

    static class Circulo {

        //Agregacion
        HAgregacion op;

        double p = 3.14;

        double area(int radio) {
            op = new HAgregacion();
            int raiz = op.square(radio);
            return p * raiz;
        }
    }

    public static void main(String[] args) {
        Circulo c = new Circulo();
        double res = c.area(5);
        System.out.println(res);
    }
}
