package cursohilosculiacancanaco.Jueves;

public class SingleByMulti2 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Test());
        Thread t2 = new Thread(new Test());
        
        t1.start();
        t2.start();
    }
}

class Test implements Runnable {

    public void run() {
        mostrar();
    }

    public void mostrar() {
        System.out.println("Tarea uno");
    }
}
