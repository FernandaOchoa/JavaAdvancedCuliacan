package cursohilosculiacancanaco.Jueves.Nivel1;

/*
Clase que contiene nombre, metodo procesar compra, tiempo a esperar en segundos

 */
public class Cajera {

    private String nombre;

    public Cajera() {

    }

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    Metodo procesarCompra() @params Cliente y long timeStamp 
     */
    public void procesarCompra(Cliente cliente, long timeStamp) {

        System.out.println("La cajera: " + this.nombre
                + " Ha comenzado a procesar la compra del cliente: " + cliente.getNombre()
                + " En un tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto: " + (i + 1)
                    + " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
        }

        System.out.println("La cajera: " + this.nombre + "Ha terminado de procesar " + cliente.getNombre()
                + "En el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
    }

    /*
    Metodo esperarXsegundos() @params int seg
     */
    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ie) {

            Thread.currentThread().interrupt();
            System.out.println(ie);
        }
    }

}
