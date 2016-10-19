package cursohilosculiacancanaco.Jueves;

public class ShutdownHookTest {

    public static void main(String[] args) throws Exception {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new TestS());
        System.out.println("Mi tarea ahora es dormir... Presiona CTRL+C para salir");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class TestS extends Thread {

    public void run() {
        System.out.println("La tarea de desconexion se realizo");
    }

}
















