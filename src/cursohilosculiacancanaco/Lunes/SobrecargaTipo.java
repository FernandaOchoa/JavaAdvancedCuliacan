package cursohilosculiacancanaco.Lunes;

public class SobrecargaTipo {

    void suma(int a, int b) {
        System.out.println("Metodo con argumentos enteros invocados");
    }

    void suma(long a, long b) {
        System.out.println("Metodo con argumentos de tipo long invocado");
    }

    public static void main(String[] args) {

        SobrecargaTipo objeto = new SobrecargaTipo();

        objeto.suma(2, 20);
        objeto.suma(1l, 3l);
    }

}
