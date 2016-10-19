package cursohilosculiacancanaco.Jueves.Nivel2;

/*
Clase que contiene nombre cliente y el carreglo del carro de compras
 */
public class Cliente {

    private String nombre;
    private int[] carroCompra;

    public Cliente() {

    }

    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;

    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}














