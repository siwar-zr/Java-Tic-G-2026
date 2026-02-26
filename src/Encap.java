import java.util.Scanner;

class Human{
    private int age;
    private String name;

//    public Human(){   //Default
//        age = 12;
//        name = "Mark";
//    }
//
//    public Human(int age, String name){  //Parametrized
//        this.age = age;
//        this.name = name;
//    }


    public Human(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

public class Encap {

    public static void main(String[] args) {
//        Human h1 = new Human(29,"John");
//        Human h2 = new Human(20,"Mark");
//        Human h3 = new Human(40);
////        h1.setAge(29);
////        h1.setName("John");
////
//        System.out.println(h1.getName() + " : " + h1.getAge());
//        System.out.println(h2.getName() + " : " + h2.getAge());

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre age : ");
        int age = sc.nextInt();

        System.out.println("Entrez votre nom complet : ");
        String name =  sc.nextLine();

        sc.nextLine();

        Human h1 = new Human(age, name);
        System.out.println(h1.getName() + " : " + h1.getAge());

    }
}
