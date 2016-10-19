package cursohilosculiacancanaco.Miercoles;

/*
El manejo de excepciones en Java es uno de los mecanismos mas poderosos,
para manejar los errores en tiempo de ejecucion, para que el flujo de la aplicacion 
se pueda mantener.

Throw -> Lanzar, Tiro, Arrojar, Echar
Hay principalmente dos tipos de excepciones: Marcadas y No Marcadas(Checked, UnChecked)
Error <-Oracle

Checked Exception: Las clases que heredan de la clase Throwable excepto RuntimeException, son conocidas como
checked exception, por ejemplo IOException, SQLException, que son excepciones comprobadas en tiempo de compilacion

Unchecked Exception: Las clases que extienden de RuntimeException, son conocidas como unchecked, por ejemplo
ArithmeticException, NullpointerException, etc.
ArrayIndexOutOfBoundException son excepciones no comprobadas en tiempo de compilacion, pero si en tiempo de ejecucion

Error: Si el error es irrecuperable, por ejemplo: OutOfMemoryError, VirtualMachineError, AssertionError
 */

public class Excepciones {
    //Escenarios comunes donde las excepciones ocurren

    //1.- Escenario con una excepcion ArithmeticException
    int a = 50 / 0; //<- Si dividimos por cero cualquier numero, ocurrira una excepcion Aritmetica

    public static void main(String[] args) {
        //2.- Escenario con una excepcion NullPointerException
        String s = null;
        System.out.println(s.length());

        //3.- Escenario con una excepcion NumberFormatException
        String s1 = "adc";
        int i = Integer.parseInt(s1);

        //4.- Escenario con un ArrayIndexOutOfBounds 
        int a[] = new int[5];
        a[10] = 50; //ArrayIndexOutOfBounds
        
        /*
        En java existen 5 palabras usadas para el manejo de excepciones
        
        1.- try
        2.- catch
        3.- finally
        4.- throw
        5.- throws
        */
    }

}
