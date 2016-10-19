package cursohilosculiacancanaco.Miercoles;

//Multiherencia con Interfaces
interface Prints {

    void print();
}

interface Mostrar {

    void print();
}

public class InterfaceTestMM implements Prints, Mostrar {
    public void print(){
        System.out.println("Hola");
    }
    
    public static void main(String [] args){
        InterfaceTestMM obj = new InterfaceTestMM();
        obj.print();
    }
}
