package cursohilosculiacancanaco.Martes;

public class DownCastTest {
    
}

class Perro8 extends DownCastTest {

    static void metodo(DownCastTest d) {
        if (d instanceof Perro8) {
            Perro8 p = (Perro8) d;
            System.out.println("Listo ya se casteo");
        }
    }
    
    public static void main(String[] args) {
        DownCastTest a = new Perro8();
        Perro8.metodo(a);
    }
}
