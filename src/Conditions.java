import org.w3c.dom.ls.LSOutput;

public class Conditions {

    public static void main(String[] args) {
//        int n = 10;
//
//        if(n > 5 && n <=10) {  // 6 --> 10
//            System.out.println("Hello !");
//            System.out.println("Thank you !");
//        }
//        else if (n<=5) // n <= 5 ou n > 10
//            System.out.println("Bye !");
//        else
//            System.out.println("GoodBye !");

        int age = 20;
        boolean tr = true;
//
//        if(age < 18)
//            System.out.println("Mineur");
//        else if (tr)   //tr --> tr == true / !tr --> tr == false
//            System.out.println("Majeur et travaille !");
//        else
//            System.out.println("Majeur et ne travaille pas !");

//        String msg = age < 18 ? "Mineur" : tr ? "Majeur et travaille !" : "Majeur et ne travaille pas !";
//        System.out.println(msg);

//        System.out.println(age < 18 ? "Mineur" : tr ? "Majeur et travaille !" : "Majeur et ne travaille pas !");
//
//        int n = 4;
//        int result = 0;

//        if (n % 2 == 0)
//            result = 10;
//        else
//            result = 20;

        // var = condition ? val si true : val si false
        // var = condition1 ? val si true : condition2 ? val si true : ........... :val si false

//        result = n % 2 == 0 ? 10 : 20;
//
//        System.out.println(result);

        int n = 4;

//        if (n == 1)
//            System.out.println("Sunday");
//        else if (n == 2)
//            System.out.println("Monday");
//        else if (n == 3)
//            System.out.println("Tuesday");
//        else if (n == 4)
//            System.out.println("Wednesday");
//        else if (n == 5)
//            System.out.println("Thursday");
//        else if (n == 6)
//            System.out.println("Friday");
//        else
//            System.out.println("Saturday");

        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid number !");
        }







    }


}
