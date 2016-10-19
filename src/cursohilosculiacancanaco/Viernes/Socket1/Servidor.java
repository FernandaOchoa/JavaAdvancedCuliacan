package cursohilosculiacancanaco.Viernes.Socket1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = " ", str2 = " ";

        while (!str.equals("stop")) {
            str = br.readLine();
            dout.writeUTF(str);

            str2 = din.readUTF();
            System.out.println("El Servidor dice: " + str2);
        }
    }
}
