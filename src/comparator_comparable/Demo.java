package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age=" + age + " and name='" + name +"'" ;
    }

    @Override
    public int compareTo(Student that) {

        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Demo {
    public static void main(String[] args) {
        /*List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(38);
        nums.add(70);
        nums.add(83);
        nums.add(19);

        Comparator<Integer> com = (i,j) -> (i%10 > j%10) ? 1 : -1;



        Collections.sort(nums,com);


        System.out.println(nums);*/


        List<Student> students = new ArrayList<>();
        students.add(new Student(20,"John"));
        students.add(new Student(40,"Jaane"));
        students.add(new Student(31,"Maaaark"));
        students.add(new Student(29,"Sophie"));

        //Comparator<Student> com1 = (o1,o2) -> o1.age > o2.age ? 1 : -1;

        //Comparator<Student> com2 = (s1,s2) -> s1.name.length() > s2.name.length() ? 1 : -1;

        //Collections.sort(students,com1);
        //Collections.sort(students, (s1,s2) -> s1.name.length() > s2.name.length() ? 1 : -1);

        Collections.sort(students);
        System.out.println(students);
    }
}
