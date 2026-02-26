class Student{
    int id;
    String name;
    int marks;
}

public class Tableaux {

    public static void main(String args[]) {
//Tableau 1D
//        int[] nums = new int[4];
//        nums[0]=4;
//        nums[1]=8;
//        nums[2]=3;
//        nums[3]=9;
//        //int nums1[] = {4,5,7,3};
//        for (int i = 0; i < 4; i++){
//            System.out.println(nums[i]);
//        }

        //Tableau 2D
//        int[][] nums = new int[3][4];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                nums[i][j]= (int) (Math.random()*10);
//            }
//        }
//
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 4; j++){
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int[] n : nums){
//            for (int m : n){
//                System.out.print(m+" ");
//            }
//            System.out.println();
//        }

        //Jagged Array

        Student s1 = new Student();
        s1.id=1;
        s1.name="John";
        s1.marks=88;

        Student s2 = new Student();
        s2.id=2;
        s2.name="Mark";
        s2.marks=56;

        Student s3 = new Student();
        s3.id=3;
        s3.name="Lily";
        s3.marks=97;
        //System.out.println(s1.name+" : "+s1.marks);

        Student[] students = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (Student s : students){
            System.out.println(s.name+" : "+s.marks);
        }


    }
}
