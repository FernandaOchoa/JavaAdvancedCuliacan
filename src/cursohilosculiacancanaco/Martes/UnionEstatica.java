package cursohilosculiacancanaco.Martes;

public class UnionEstatica {

    private void comer() {
        System.out.println("El perro esta comiendo...");
    }

    public static void main(String[] args) {
        UnionEstatica u = new UnionEstatica();
        u.comer();
    }
}
