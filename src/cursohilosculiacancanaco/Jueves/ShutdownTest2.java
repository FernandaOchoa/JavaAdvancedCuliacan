package cursohilosculiacancanaco.Jueves;

public class ShutdownTest2 {

    public static void main(String[] args) throws Exception {
       //Runtime = en el tiempo de ejecucion, es de donde vamos a detener todo
        Runtime r = Runtime.getRuntime();

        r.addShutdownHook(new Thread() {

            public void run() {
                System.out.println("La desconexion se realizo correctamente");
            }
        });

        System.out.println("Ahora dormire presiona ctrl + c para salir");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
