package Abstraction;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface A{

    int age = 44;      //Par defaut final static
    String area = "Tunis";
    void show();     //Par defaut public abstract
    void config();
}

interface X{
    void run();
    //void show();
}

interface Y extends X{

}

class B implements A,Y{

    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

}
public class Interfaces {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.config();
        obj.show();
        //obj.run(); car A ne contient pas la déclaration de la méthode run()
        //A.area = "Beja";
        //System.out.println(A.area);

        X obj1 = new B();
        obj1.run();
//ou
        B obj2 = new B();
        obj2.config();
        obj2.show();
        obj2.run();
    }
}
