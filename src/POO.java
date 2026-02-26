import java.sql.SQLOutput;

class Calculator{

    int num = 5;

    //Method OverLoading / Surcharge des méthodes
    //Changement des params : en nombre ou en type
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int add(int a, int b){
        System.out.println(a);
        return a + b;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
}

//class Computer{
//    public void playMusic(){
//        System.out.println("Music Playing...");
//    }
//    public String giveMeSmthg(int cost){
//        if (cost >= 5){
//            return "Something";
//        }
//        return "Nothing";
//    }
//}




public class POO {

    public static void main(String[] args) {

        int data = 10;

//        int result = num1 + num2;
//        System.out.println(result);
        Calculator calc = new Calculator();
        System.out.println(calc);
//        int r1 = calc.add(2,8,1);
        //int r1 = calc.add(2,8);
        //System.out.println(r1);
        Calculator calc1 = new Calculator();
        System.out.println(calc1);
        calc.num=8;
        System.out.println(calc.num);
        System.out.println(calc1.num);
//        Computer obj = new Computer();
//        obj.playMusic();
//        System.out.println(obj.giveMeSmthg(3));


    }
}
