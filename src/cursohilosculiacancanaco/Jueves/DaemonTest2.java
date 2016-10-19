package cursohilosculiacancanaco.Jueves;

public class DaemonTest2 extends Thread {

    public void run() {
        System.out.println("Nombre: " + Thread.currentThread().getName());
        System.out.println("Daemon: " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonTest2 t1 = new DaemonTest2();
        DaemonTest2 t2 = new DaemonTest2();
        
        //Si lo inicio y luego lo convierto no es buena idea, nos arroja una excepcion
        t1.start();
        try{
               //Pandas mueren cuando hacemos lo siguiente
        t1.setDaemon(true);
        }catch(IllegalThreadStateException itee){
            System.out.println(itee);
        }
        t2.setDaemon(true);
        t2.start();
    }
}
