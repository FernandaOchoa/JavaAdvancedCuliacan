
package cursohilosculiacancanaco.Miercoles.Threads;
//Capturar la excepcion y de esta manera no se puede

public class TestTwice extends Thread {
    public void run(){
        System.out.println("corriendo...");
    }
    
    public static void main(String[] args) {
        TestTwice t1 = new TestTwice();
        
        t1.start();
        t1.start();
    }
}
