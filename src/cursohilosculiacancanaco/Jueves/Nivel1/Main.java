package cursohilosculiacancanaco.Jueves.Nivel1;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Francisco", new int[]{2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Uriel", new int[]{1, 3, 5, 1, 1});
        
        Cajera cajera1 = new Cajera("Martha");
        Cajera cajera2 = new Cajera("Alejandra");

        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
    }
}
