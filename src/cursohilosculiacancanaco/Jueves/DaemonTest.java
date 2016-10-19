package cursohilosculiacancanaco.Jueves;

/*
En java, cuando hablamos de hilos, podemos separarlos en 2 tipos, concurrentes (de sistema) o no concurrentes
(definidos por nosotros), los primeros son llamados Daemon (Demonio)
Un demonio es un servicio residente, no interactivo, que se ejecuta de manera persistente y que puede ser reiniciado
si se intenta matar el proceso.(Dependiendo de la configuracion del demonio y politicas del sistema)
Caracteristicas:
   1.- No disponen de una interfaz grafica
   2.- No hacen uso de entradas y salidas estandar para comunicar errores o registrar su funcionamiento, sino que 
   usan archivos del sistema en zonas especiales (/var/log/ en los Unix) o utilizan otros demonios especializados   
   en dicho registro como syslog
    3.- Es un hilo de baja prioridad

Un ejemplo es cuando hay un host web, utiliza un daemon httpd(HTTP Daemon) para ofrecer el servicio y que los
visitantes a dicha web puedan acceder.
El servicio explorer.exe es un servicio que si bien puede ser reiniciado, tambien se puede detener, causando asi
la cancelacion de controles en pantalla de Windows.
 */
public class DaemonTest extends Thread {

    public void run() {
        //Verificamos si el hilo actual es un demonio
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Es un hilo de tipo Demonio");
        } else {
            System.out.println("Es un hilo definido por el Usuario");
        }
    }

    public static void main(String[] args) {
        DaemonTest t1 = new DaemonTest();
        DaemonTest t2 = new DaemonTest();
        DaemonTest t3 = new DaemonTest();
        DaemonTest t4 = new DaemonTest();

        //El hilo ahora es un demonio
        t1.setDaemon(true);
        t1.start();

        t2.start();
        t3.start();
        t4.start();
    }

}
