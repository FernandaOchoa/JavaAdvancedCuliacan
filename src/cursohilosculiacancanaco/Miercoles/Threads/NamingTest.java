package cursohilosculiacancanaco.Miercoles.Threads;

public class NamingTest extends Thread {

    public void run() {
        System.out.println("corriendo");
    }

    public static void main(String[] args) {
        NamingTest t1 = new NamingTest();
        NamingTest t2 = new NamingTest();

        System.out.println("Nombre del hilo 1: " + t1.getName());
        System.out.println("Nombre del hilo 2: " + t2.getName());
        t1.start();
        t2.start();

        t1.setName("Hilo A");
        System.out.println("Despues del cambio: " + t1.getName());

        t2.setName("Hilo B");
        System.out.println("Despues del cambio: " + t2.getName());
    }
}
