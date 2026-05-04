package lesCollections;

//Collection API -> Concept / idée
//Collection -> Interface
//Collections -> Classe

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //int num = 5;
        //int[] nums = new int[6];

        /*Set<Integer> nums = new TreeSet<Integer>();

        nums.add(63);
        nums.add(50);
        nums.add(81);
        nums.add(52);
        nums.add(68);
        nums.add(10);
        nums.add(10);*/

        /*Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }*/

        //Hashset pas de tri mais treeset pour des valeurs triées automatiquement
        //nums.add("5");

        //System.out.println(nums);
        //System.out.println(nums.get(2)); //8
        //System.out.println(nums.indexOf(2));//3

        /*for(int n : nums){
            //int num = (Integer)n;
            System.out.println(n);
        }*/

        /*ArrayList<String> list = new ArrayList();
        list.add("Bonjour");
        list.add("10");
        //Sans generics, je peux melanger les types (string + int)

        String s = (String) list.get(1); //erreur à l'execution*/

        Map<String, Integer> students = new HashMap<>();

        students.put("John", 56);
        students.put("Jane", 80);
        students.put("Mark", 67);
        students.put("Suzy", 90);
        students.put("Jane", 85);


        //System.out.println(students.get("Jane"));
        //Les cles sont uniques

        System.out.println(students.keySet());
        students.remove("Suzy");
        for (String key : students.keySet())
            System.out.println(key + " : " + students.get(key));




    }
}
