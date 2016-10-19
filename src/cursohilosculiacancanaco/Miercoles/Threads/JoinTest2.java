package cursohilosculiacancanaco.Miercoles.Threads;

public class JoinTest2 extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {

            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        JoinTest2 t1 = new JoinTest2();
        JoinTest2 t2 = new JoinTest2();
        JoinTest2 t3 = new JoinTest2();
        JoinTest2 t4 = new JoinTest2();

        t1.start();
        try {
            t1.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
        t4.start();
    }

}
