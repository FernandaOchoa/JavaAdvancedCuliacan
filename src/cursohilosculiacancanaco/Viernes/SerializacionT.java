package cursohilosculiacancanaco.Viernes;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializacionT {

    public static void main(String[] args) throws Exception {
        Estudiante e1 = new Estudiante(111, "Lizeth");

        FileOutputStream fout = new FileOutputStream("C:\\f.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(e1);
        out.flush();
        System.out.println("Listo");
    }

}
