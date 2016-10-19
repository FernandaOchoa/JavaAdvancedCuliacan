package cursohilosculiacancanaco.Jueves.Nivel4;

public class Cajera implements Runnable {

    private Cliente cliente;
    private long initialTime;

    public Cajera(Cliente cliente, long initialTime) {
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public void run() {
        System.out.println("La cajera:  " + Thread.currentThread().getName()
                + "Ha comenzado a procesar la compra del cliente: " + this.cliente.getNombre()
                + "En el tiempo: " + (System.currentTimeMillis() - initialTime) / 1000 + "seg");

        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            //ya vine
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto: " + (i + 1)
                    + " del " + this.cliente.getNombre() + " En el tiempo: "
                    + (System.currentTimeMillis() - initialTime) / 1000 + " seg");

        }
        System.out.println("La cajera: " + Thread.currentThread().getName()
                + "Ha terminado de procesar los productos del cliente: "
                + this.cliente.getNombre() + "En el tiempo: " + (System.currentTimeMillis() - initialTime) / 1000 + " seg");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    public long getInitialTime() {
        return initialTime;

    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
