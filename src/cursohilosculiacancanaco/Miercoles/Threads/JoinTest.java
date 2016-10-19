package cursohilosculiacancanaco.Miercoles.Threads;

/*
El metodo join() espera a que un hilo muera... para dar paso a otro
Hace que los hilos que se esten ejecutando actualmente, se detengan hasta que el hilo que se une
termine su tarea.
 */
public class JoinTest extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        JoinTest t1 = new JoinTest();
        JoinTest t2 = new JoinTest();
        JoinTest t3 = new JoinTest();
        JoinTest t4 = new JoinTest();

        t1.start();

        try {
            t1.join();
            System.out.println("Hilo 1 colado");
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t4.start();
        try {
            t4.join();
            System.out.println("Hilo 4 colado");
        } catch (Exception e) {
            System.out.println(e);
        }
        t3.start();
        
        /*t4.start();
        try {
            t4.join();
            System.out.println("Hilo 4 colado");
        } catch (Exception e) {
            System.out.println(e);
        }
*/

    }

}
