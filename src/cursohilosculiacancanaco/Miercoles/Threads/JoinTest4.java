package cursohilosculiacancanaco.Miercoles.Threads;

public class JoinTest4 extends Thread {

    public void run() {
        System.out.println("El nombre del hilo actual es: " + (Thread.currentThread().getName()));
    }

    public static void main(String[] args) {
        JoinTest4 t1 = new JoinTest4();
        JoinTest4 t2 = new JoinTest4();

        t1.start();
        t2.start();
    }
}
