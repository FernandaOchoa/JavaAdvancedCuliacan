package cursohilosculiacancanaco.Miercoles.Threads;

/*Existen 3 tipos constantes de prioridad
 * public static int MIN_PRIORITY
 * public static int NORM_PRIORITY
 * public static int MAX_PRIORITY
 */
public class PriorityTest extends Thread {

    public void run() {
        System.out.println("corriendo el hilo con el nombre: " + Thread.currentThread().getName());
        System.out.println("corriendo la prioridad: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        PriorityTest t1 = new PriorityTest();
        PriorityTest t2 = new PriorityTest();

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
