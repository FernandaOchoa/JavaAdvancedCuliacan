package cursohilosculiacancanaco.Viernes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializacion {

    public static void main(String[] args) throws Exception {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\f.txt"));

        Estudiante e = (Estudiante) in.readObject();
        System.out.println(e.id + " " + e.nombre);

        in.close();

    }

}
