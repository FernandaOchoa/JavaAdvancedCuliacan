package cursohilosculiacancanaco.Jueves.Nivel2;

public class CajeraThread extends Thread{
    private String nombre;
    private Cliente cliente;
    private long initialTime;
    
    public CajeraThread(){
        
    }
    public CajeraThread(String nombre, Cliente cliente, long initialTime){
        this.nombre= nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public long getInitialTime(){
        return initialTime;
    }
    public void setInitialTime(long initialTime){
        this.initialTime = initialTime;
    }
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    /*
    Ahora si, viene el hilo... muajajajaja
    */
    
    public void run(){
        System.out.println("La cajera "+this.nombre+
                " Ha comenzado a procesar la compra del cliente: "+this.cliente.getNombre()+
                " En el tiempo: " + (System.currentTimeMillis() - this.initialTime)/1000 +" seg");
        
        for(int i = 0; i< this.cliente.getCarroCompra().length; i++){
            //Procesamos el pedido en segundos
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            
            System.out.println("Procesando el producto: "+(i+1) +"del cliente: "+
                    this.cliente.getNombre()+ "En el tiempo: "+(System.currentTimeMillis()- this.initialTime)/1000
            +" seg");
         
        }
        System.out.println("La cajera: "+this.nombre+" Ha terminado con el cliente: "+this.cliente.getNombre()+
                    " En el tiempo: "+(System.currentTimeMillis()- this.initialTime)/1000 +" seg");
    }
    
    private void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos * 1000);
        }catch(InterruptedException ie){
            Thread.currentThread().interrupt();
            System.out.println(ie);
        }
    }
}
















