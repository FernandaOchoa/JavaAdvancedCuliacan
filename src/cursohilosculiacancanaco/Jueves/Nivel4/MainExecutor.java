package cursohilosculiacancanaco.Jueves.Nivel4;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutor {

    private static final int numCajeras = 8;

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Alejandro", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Francisco", new int[]{3, 1, 1, 2, 1,2}));
        clientes.add(new Cliente("Uziel", new int[]{2,1,1,1, 1, 3, 2}));
        clientes.add(new Cliente("Uriel", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Victor", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Ferro", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Cristina", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Lizeth", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Selene", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Paloma", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("David", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Edith", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Militza", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Cirino", new int[]{2, 2, 1, 5, 2}));

        long init = System.currentTimeMillis();

        ExecutorService ejecutor = Executors.newFixedThreadPool(numCajeras);

        for (Cliente cliente : clientes) {
            Runnable cajera = new Cajera(cliente, init);
            ejecutor.execute(cajera);
        }
        //Cerramos el gestor de hilos 
        ejecutor.shutdown();

        while (!ejecutor.isTerminated()) {
            //Mientras se siga ejecutando

        }
        long fin = System.currentTimeMillis(); //Justo cuando se acaba

        System.out.println("Tiempo tal de procesamiento: " + (fin - init) / 1000 + " segundos");
    }
}
