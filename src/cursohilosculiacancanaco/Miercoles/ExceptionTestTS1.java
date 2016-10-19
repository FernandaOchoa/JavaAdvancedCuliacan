package cursohilosculiacancanaco.Miercoles;

import java.io.IOException;

/*
 *
 * Caso 1 cuando la excepcion no ocurre
 */
public class ExceptionTestTS1 {

    public static void main(String[] args) throws IOException {
        M1 m = new M1();
        m.metodo();

        System.out.println("Resto de codigo...");
    }

}

class M1 {

    void metodo() throws IOException {
        System.out.println("Operacion realizada");
    }
}
















