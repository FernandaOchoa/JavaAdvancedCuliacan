package cursohilosculiacancanaco.Jueves;
/*
Como ejecutar una misma tarea en muchos hilos
*/
public class SingleByMulti extends Thread {
    public void run(){
        System.out.println("Tarea uno");
    }
    
    public static void main(String[] args) {
        
        SingleByMulti t1 = new SingleByMulti();
        SingleByMulti t2 = new SingleByMulti();
        SingleByMulti t3 = new SingleByMulti();
        
        t1.start();
        t2.start();
        t3.start();
    }
}
