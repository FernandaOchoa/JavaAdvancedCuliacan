package cursohilosculiacancanaco.Viernes;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {

    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("C:\\salida.txt");

        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String texto = "Soy un mensajito ";
        byte b[] = texto.getBytes();
        bout.write(b);

        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Listo :p");

    }

}
