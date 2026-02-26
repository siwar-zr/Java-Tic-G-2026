public class Loops {

    public static void main(String[] args) {

        //Pour répéter des instructions plus qu'une fois
        // Loops - while, do while, for

       // int i = 5;
//
//        while(i <= 4) {
//            System.out.println("Hi "+i);
//            int j = 1;
//            while(j <= 3){
//                System.out.println("Hello");
//                j++;
//            }
//            i++;
//        }
//        System.out.println("Goodbye "+i);
//        do {
//            System.out.println("Hi "+i);
//            i++;
//        }while(i<=4);

        for (int i = 1; i <= 5; i++){
            System.out.println("DAY "+i);
            for (int j = 1; j <= 9; j++){
                System.out.println("    "+ (j+8) +" - "+ (j+9));
            }
        }





    }
}
