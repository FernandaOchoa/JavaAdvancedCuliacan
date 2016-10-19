package cursohilosculiacancanaco.Viernes;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamToOutput {

    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("C:\\FileOutputStreamTest.txt");
        FileOutputStream fout = new FileOutputStream("C:\\FileInputStreamToOutput.txt");

        int i = 0;
        while ((i = fin.read()) != -1) {
            fout.write((byte) i);
        }
        fin.close();
    }

}
