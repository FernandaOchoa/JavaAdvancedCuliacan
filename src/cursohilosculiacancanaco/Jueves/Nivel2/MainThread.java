package cursohilosculiacancanaco.Jueves.Nivel2;

public class MainThread {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Francisco", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Uriel", new int[]{2, 2, 1, 2, 2, 1, 2, 1, 1, 1});

        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        CajeraThread cajera1 = new CajeraThread("Martha", cliente1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Alejandra", cliente2, initialTime);

        cajera1.start();
        cajera2.start();

    }
}
