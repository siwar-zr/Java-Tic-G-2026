public class Operators {

    public static void main(String[] args) {

        //Arithmetic

//        int a = 5;
//        //int b = 2;
//
//        //int result = a / b; //renvoie un int toujours
//        //int result = a % b;
//
//        //a = a + 2;
//        //a += 1; // -= *= /= %=
//        //int result = a++;  //Post-incrément
//        int result = ++a;   //Pré-incrément
//
//        System.out.println(result);
//        System.out.println(a);

        //Relational

        // < > <= >= == !=

//        int x = 6;
//        int y = 7;
//
//        boolean result = x != y;
//        System.out.println(result);

        //Logical
        // AND &  OR |   NOT !
        //     &&    ||

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = (x > y || a > b) && a < 1 ;
        //Priorité par AND
        System.out.println(!result);


    }
}
