package cursohilosculiacancanaco.Miercoles.Threads;

public class Multi extends Thread {

    public void run() {
        System.out.println("Hilo esta corriendo");
    }

    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }
}
