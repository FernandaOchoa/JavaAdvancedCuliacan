package cursohilosculiacancanaco.Martes;

public class DownCastTestW {
    
}

class Perro9 extends DownCastTestW {

    static void metodo(DownCastTestW d) {
        Perro9 p = (Perro9) d;
        System.out.println("Listo ya se casteo");
    }
    
    public static void main(String[] args) {
        DownCastTestW a = new Perro9();
        Perro9.metodo(a);
    }
}
