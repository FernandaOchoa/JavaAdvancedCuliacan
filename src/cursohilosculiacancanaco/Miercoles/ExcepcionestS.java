package cursohilosculiacancanaco.Miercoles;

public class ExcepcionestS {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Tarea 1 lista " + ae);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Tarea 2 lista " + aiobe);
        } catch (Exception e) {
            System.out.println("Tareas comunes realizadas");
        }

        System.out.println("El resto de codigo a ejecutar...");
    }
}
