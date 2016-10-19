package cursohilosculiacancanaco.Miercoles.Threads;

public class RunInsteadOf2 extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }

    public static void main(String[] args) {
        RunInsteadOf2 t1 = new RunInsteadOf2();
        RunInsteadOf2 t2 = new RunInsteadOf2();

        t1.run();
        t2.run();
    }
}
