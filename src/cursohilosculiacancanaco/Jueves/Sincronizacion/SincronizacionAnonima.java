package cursohilosculiacancanaco.Jueves.Sincronizacion;

public class SincronizacionAnonima {

    public static void main(String[] args) {
        final Numero2 no = new Numero2();

        Thread t1 = new Thread() {
            public void run() {
                no.print(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                no.print(100);
            }
        };
        t1.start();
        t2.start();
    }
}

class Numero2 {

    synchronized void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);

            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
