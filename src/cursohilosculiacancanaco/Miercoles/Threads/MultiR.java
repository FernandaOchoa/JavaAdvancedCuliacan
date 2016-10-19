package cursohilosculiacancanaco.Miercoles.Threads;

public class MultiR implements Runnable {
    
    public void run(){
        System.out.println("El hilo esta corriendo");
    }
    
    public static void main(String[] args) {
        
        MultiR m1 = new MultiR();
        Thread t1 = new Thread(m1);
        
        Thread t2 = new Thread(new MultiR());
        
        t1.start();
        t2.start();
    }
    
}
