package cursohilosculiacancanaco.Miercoles.Threads;

public class TestSleep extends Thread {

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
        TestSleep t1 = new TestSleep();
        TestSleep t2 = new TestSleep();

        t1.start();
        t2.start();
    }
}
