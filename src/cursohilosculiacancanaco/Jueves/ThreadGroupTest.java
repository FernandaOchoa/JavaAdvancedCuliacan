package cursohilosculiacancanaco.Jueves;

/*
    ThreadGroup en Java
    Java proporciona una manera conveniente de agrupar multiples hilos en un solo objeto
    De tal manera, que podemos suspender, reanudar o interrumpir un grupo de hilos con una sola llamada
    al metodo
    suspend(), resume(), y stop() ahora estan deprecados
    Java ThreadGroup se implementa por medio de java.lang.ThreadGroup

    Callbacks de ThreadGroup
    
    1.- int activeCount()->Regresa el numero de subprocesos que se ejecutan en el grupo actual
    2.- int activeGroup() ->Regresa el numero del grupo activo en un grupo de hilos
    3.- void Destroy() ->Destruye el grupo de hilos y sus subgrupos
    4.- ThreadGroup getParent() ->Regresa el hilo padre
    5.- void interrupt() -> Interrumpe todos los hilos del grupo
    6.- String getName() -> Regresa el nombre del grupo
    7.- void list() -> Imprime la informacion de este grupo en la consola

 */
public class ThreadGroupTest implements Runnable {

    public void run() {
        mostrar();
    }

    public static void main(String[] args) {
        ThreadGroupTest g = new ThreadGroupTest();
        ThreadGroup tg1 = new ThreadGroup("Padre del Grupo de Hilos");

        Thread t1 = new Thread(tg1, g, "Uno");
        Thread t2 = new Thread(tg1, g, "Dos");
        Thread t3 = new Thread(tg1, g, "Tres");
        Thread t4 = new Thread(tg1, g, "Cuatro");
        Thread t5 = new Thread(tg1, g, "Cinco");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        System.out.println("El nombre del grupo"+tg1.getName());
        tg1.list();
    }

    public void mostrar() {
        System.out.println(Thread.currentThread().getName());
    }

}
