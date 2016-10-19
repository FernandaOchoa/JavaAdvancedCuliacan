package cursohilosculiacancanaco.Miercoles;

interface Print {

    void print();
}

interface Shows extends Print {

    void show();
}

//Una clase que implementa una interface pero extiende de otra
public class InterfaceTestEBNE implements Shows {

    public void print() {
        System.out.println("Hola");
    }

    public void show() {
        System.out.println("Bienvenido");
    }

    public static void main(String[] args) {
        InterfaceTestEBNE ob = new InterfaceTestEBNE();
        ob.print();
        ob.show();
    }

}
