package cursohilosculiacancanaco.Miercoles.Threads;

public class RunInsteadOf extends Thread {
    public void run(){
        System.out.println("corriendo...");
    }
    
    
    /*
    Cada hilo se inicia en una pila de llamadas por separado
    Invocamos al metodo run del hilo principal, el metodo run entra a la pila de llamadas
    actual en lugar de en el comienzo de una nueva pila 
    */
    public static void main(String[] args) {
        RunInsteadOf t1 = new RunInsteadOf();
        t1.run();
    }
}
