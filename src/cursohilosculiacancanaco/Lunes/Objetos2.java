package cursohilosculiacancanaco.Lunes;

public class Objetos2 {

    int rollNo;
    String nombres;

    void insertaRegistro(int r, String n) {

        rollNo = r;
        nombres = n;
    }

    void muestraInformacion() {
        System.out.println(rollNo + " " + nombres);
    }

    public static void main(String[] args) {
        Objetos2 o = new Objetos2();
        Objetos2 o2 = new Objetos2();

        o.insertaRegistro(11, "Fernanda");
        o2.insertaRegistro(12, "Francisco");

        o.muestraInformacion();
        o2.muestraInformacion();
    }

}
