package cursohilosculiacancanaco.Viernes;

import java.io.FileOutputStream;

public class FileOutputStreamTest {

    public static void main(String[] args) {
        try {

            FileOutputStream fout = new FileOutputStream("C:\\FileOutputStreamTest.txt");
            String texto = "Hola soy un archivo escrito en java";
            byte b[] = texto.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Listo :D");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
