package cursohilosculiacancanaco.Lunes;

/*
Es una entidad del mundo real que tiene 3 principales caracteristicas
Estado (Representa el valor del objeto)
Comportamiento ( Representa la funcionalidad que tiene un objeto)
Identidad (Es el identificador unico, el cual no es visible para el usuario final)
 */
public class EjemploObjetos {

    int id = 1;
    String nombre = "Fernanda";

    public static void main(String[] args) {
        
        EjemploObjetos objeto = new EjemploObjetos();
        
        System.out.println(objeto.id);
        System.out.println(objeto.nombre);
    }
}
