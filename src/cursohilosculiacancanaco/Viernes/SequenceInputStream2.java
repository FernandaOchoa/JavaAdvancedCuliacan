package cursohilosculiacancanaco.Viernes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream2 {

    public static void main(String[] args) throws Exception {

        FileInputStream fin1 = new FileInputStream("C:\\f1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\f2.txt");

        FileOutputStream fout = new FileOutputStream("C:\\f3.txt");

        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);

        int i;
        while ((i = sis.read()) != -1) {
            fout.write(i);
            System.out.println("Listo :d");
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();

    }

}
