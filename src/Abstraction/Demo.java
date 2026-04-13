package Abstraction;

//Methode sans body --> abstract method
//abstract method --> abstract class
//Si on herite d'une classe abstraite on doit faire le overriding de toutes ses methodes abstraites sinon on la declare abstraite aussi
//Un classe abstraite ne peut pas etre instanciée

abstract class Car{   //Pour ne pas etre instanciée
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Music Playing...");
    }
}

abstract class BMW extends Car{

    public void drive() {
        System.out.println("Driving BMW..");
    }

}

class UpdatedBMW extends BMW{    //Concrete class
    public void fly(){
        System.out.println("Flying..");
    }
}
public class Demo {
    public static void main(String[] args) {
        Car obj = new UpdatedBMW();
        //obj.drive(); doit etre déclarée BMW pas Car
        obj.playMusic();
        obj.fly();



    }
}
