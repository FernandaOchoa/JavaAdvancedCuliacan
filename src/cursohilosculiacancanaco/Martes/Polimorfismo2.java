
package cursohilosculiacancanaco.Martes;

public class Polimorfismo2 {
    int limite = 90;
    
}

class Marca3 extends Polimorfismo2 {
    int limite = 150;
    
    public static void main(String[] args) {
        
        Polimorfismo2 obj = new Marca3();
        System.out.println(obj.limite);
    }
}
