package cursohilosculiacancanaco.Viernes;

import java.io.FileInputStream;

public class FileInputStreamTest {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\FileOutputStreamTest.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
