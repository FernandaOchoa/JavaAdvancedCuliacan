
package cursohilosculiacancanaco.Martes;

public /* final */ class FinalEjemplo3 {
    
}
class Marca2 extends FinalEjemplo3 {
    void run(){
        System.out.println("No se puede heredar una clase que es final");
    }
    public static void main(String[] args) {
        
        Marca2 marca = new Marca2();
        marca.run();
    }
}
