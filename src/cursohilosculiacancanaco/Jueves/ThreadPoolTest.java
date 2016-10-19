package cursohilosculiacancanaco.Jueves;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Java Thread pool representa un grupo de hilos que trabajan por un objetivo y que pueden ser reutilizados muchas veces
En caso de un thread pool, se crea un grupo de hilos de un tamaño fijo
Un Thread pool, se le asigna el puesto de trabajo de acuerdo al service provider 
Despues de que terminan un trabajo el hilo se contiene en el grupo de subprocesos de nuevo
Ventaja: Mejor rendimiento -> se ahorra tiempo ya que no hay que crear un nuevo hilo
Se usan en tiempo real
Se utilizan en Servlets y JSP donde se crea un grupo de subprocesos para realizar cada solicitud
Ejecutores ->ExecutorService y Ejecutor ->Executors
 */
public class ThreadPoolTest implements Runnable {

    private String mensaje;

    public ThreadPoolTest(String s) {
        this.mensaje = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()
                + "(Inicio) mensaje = " + mensaje);
        mensajeAprocesar();
        System.out.println(Thread.currentThread().getName() + "(Fin)");
    }

    private void mensajeAprocesar() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ExecutorService ejecutor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable p1 = new ThreadPoolTest("" + i);
            ejecutor.execute(p1);

        }
        ejecutor.shutdown();
        while (!ejecutor.isTerminated()) {
            
        }
        System.out.println("Ya se murieron todos... D:");

    }
}
