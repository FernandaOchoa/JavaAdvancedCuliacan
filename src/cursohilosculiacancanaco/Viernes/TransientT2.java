package cursohilosculiacancanaco.Viernes;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TransientT2 {

    public static void main(String[] args) throws Exception {

        TransientTest t = new TransientTest(111, "Fernanda", 23);

        FileOutputStream f = new FileOutputStream("C:\\f.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);

        out.writeObject(t);
        out.flush();

        out.close();
        f.close();
        System.out.println("Listo");

    }

}
