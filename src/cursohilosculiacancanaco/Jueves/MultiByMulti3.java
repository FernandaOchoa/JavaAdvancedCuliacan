package cursohilosculiacancanaco.Jueves;

public class MultiByMulti3 {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Tarea uno");
            }
        };

        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("Tarea dos");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }

}
