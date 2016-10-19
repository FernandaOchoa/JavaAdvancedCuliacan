package cursohilosculiacancanaco.Lunes;

/*
La palabra reservada estatica en java es usada para la administracion eficiente de la memotia
principalmente, se puede aplicar a variables, metodos, bloques y clases anidadas

La variable estatica se usa en memoria solo una ve, al momento de cargar la clase
 */
public class Estaticos {

    int control;
    String nombre;
    static String escuela = "ITC";

    Estaticos(int c, String n) {
        control = c;
        nombre = n;
    }

    void mostrar() {
        System.out.println(control + " " + nombre + " " + escuela);
    }

    public static void main(String[] args) {
        Estaticos e1 = new Estaticos(1, "Fernanda");
        Estaticos e2 = new Estaticos(2, "Alejandro");

        e1.mostrar();
        e2.mostrar();
    }
}
