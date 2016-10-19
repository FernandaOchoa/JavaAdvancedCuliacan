package cursohilosculiacancanaco.Lunes;

/*
Los 6 usos de la palabra reservada this

1.- Rerefencia a una variable de instancia de la clase actual
2.-this() puede ser usado para invocar al metodo constructor de la clase actual
3.- puede utilizarse para invocar al metododo de la clase actual
4.- this puede pasar como un argumento en la llamada a un metodo
5.- this puede pasar como argumento en la llamada de un consturctor
6.- this se utiliza para devolver la instancia de la clase actual
 */
public class PalabraThis {

    int id;
    String nombre;

    PalabraThis(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String[] args) {

        PalabraThis p1 = new PalabraThis(1, "Fernanda");
        PalabraThis p2 = new PalabraThis(1, "Uriel");

        p1.mostrar();
        p2.mostrar();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
