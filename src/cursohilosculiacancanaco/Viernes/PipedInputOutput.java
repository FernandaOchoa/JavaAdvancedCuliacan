package cursohilosculiacancanaco.Viernes;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutput extends Thread {

    public static void main(String[] args) throws Exception {

        final PipedOutputStream pout = new PipedOutputStream();
        final PipedInputStream pin = new PipedInputStream();

        //Conecto ambos flujos
        pout.connect(pin);

        //Creamos un hilo que escribe los datos
        Thread t1 = new Thread() {

            public void run() {
                for (int i = 65; i <= 90; i++) {
                    try {
                        pout.write(i);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        };
        //Hilo que escribe los datos
        Thread t2 = new Thread() {
            public void run() {
                try {
                    for (int i = 65; i <= 90; i++) {
                        System.out.println(pin.read());
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        //Inicio los hilos
        t1.start();
        t2.start();
    }
}
