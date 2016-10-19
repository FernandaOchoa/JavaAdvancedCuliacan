package cursohilosculiacancanaco.Miercoles.Threads;

public class JoinTest3 extends Thread {

    public void run() {
        System.out.println("corriendo....");
    }

    public static void main(String[] args) {
        JoinTest3 t1 = new JoinTest3();
        JoinTest3 t2 = new JoinTest3();

        String nt1 = t1.getName();
        long it1 = t1.getId();
        System.out.println("Nombre del hilo 1 es: " + nt1);
        System.out.println("Nombre del hilo 2 es: " + t2.getName());
        System.out.println("Id del hilo 1 es: " + it1);
        System.out.println("Id del hilo 2 es: " + t2.getId());

        t1.start();
        t2.start();

        t1.setName("Hilo 1");
        System.out.println("Despues del cambio ahora me llamo: " + t1.getName());
    }
}
