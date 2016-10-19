package cursohilosculiacancanaco.Viernes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamTest {

    public static void main(String[] args) throws Exception {
       
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Introduce tu nombre");
        String nombre = br.readLine();
        System.out.println("Hola " + nombre);
    }

}
