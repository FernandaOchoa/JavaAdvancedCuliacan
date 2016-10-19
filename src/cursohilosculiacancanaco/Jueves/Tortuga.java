package cursohilosculiacancanaco.Jueves;

public class Tortuga extends Thread {

    public void run() {

        int i = 0;
        System.out.println("Inicia la tortuga");
        while (i < 5) {

            try {
                Thread.sleep(5000);
                System.out.println("Tortuga");
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
        System.out.println("Termino la tortuga");
    }

}
