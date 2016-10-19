package cursohilosculiacancanaco.Miercoles;

interface InterfaceTestM {

    void print();
}

interface Muestra {

    void mostrar();
}

//Multiherencia Existe en caso de una interface, de clase a clase no, pero de interface a clase si
//Ya que no hay una ambiguedad provista por la implementacion de la clase
class InterfaceTestMC implements InterfaceTestM, Muestra {

    public void print() {
        System.out.println("Hola");
    }

    public void mostrar() {
        System.out.println("Bienvenido");
    }

    public static void main(String[] args) {
        InterfaceTestMC obj = new InterfaceTestMC();

        obj.print();
        obj.mostrar();
    }
}
