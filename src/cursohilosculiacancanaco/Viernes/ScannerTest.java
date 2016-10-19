package cursohilosculiacancanaco.Viernes;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu estatura ");
        double estatura = sc.nextDouble();

        System.out.println("Nombre: " + nombre + " \nEdad: " + edad + " \nEstatura: " + estatura);
    }

}
