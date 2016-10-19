package cursohilosculiacancanaco.Miercoles;

import java.io.IOException;

/*
Caso 2 cuando la excepcion si ocurre
 */
class N {

    void metodo() throws IOException {
        throw new IOException("Error");
    }
}

public class ExcepcionesTestTS2 {

    public static void main(String[] args) throws IOException {
        N n = new N();
        n.metodo();
        System.out.println("Flujo normal... resto de codigo");
    }

}
