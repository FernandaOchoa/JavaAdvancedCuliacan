package cursohilosculiacancanaco.Jueves;

public class Liebre implements Runnable {

    public void run() {
        int i = 0;
        System.out.println("Inicia la Liebre");

        while (i < 5) {
            try {
                Thread.sleep(2000);
                System.out.println("Liebre");
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
        System.out.println("Termina la Liebre");
    }

}
