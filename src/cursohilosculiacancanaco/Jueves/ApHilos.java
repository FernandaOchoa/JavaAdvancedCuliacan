package cursohilosculiacancanaco.Jueves;

public class ApHilos {

    public static void main(String[] args) {
        Tortuga t1 = new Tortuga();
        Thread t2 = new Thread(new Liebre());

        t1.start();
        t2.start();
    }

}
