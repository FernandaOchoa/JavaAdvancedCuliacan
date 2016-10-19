package cursohilosculiacancanaco.Lunes;

public class ContadorE {

    static int contador = 0;

    ContadorE() {
        contador++;
        System.out.println(contador);
    }

    public static void main(String[] args) {
        ContadorE c1 = new ContadorE();
        ContadorE c2 = new ContadorE();
        ContadorE c3 = new ContadorE();
    }

}
