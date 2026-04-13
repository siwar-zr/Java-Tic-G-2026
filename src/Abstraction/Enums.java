package Abstraction;

enum Status{
    Running, Failed, Pending, Success
}
public class Enums {
    public static void main(String[] args) {

        int i = 5;
        Status s = Status.Running;
        Status[] ss = Status.values();
        //System.out.println(s);
        //System.out.println(s.ordinal());
        //System.out.println(ss[0]);
        for(Status st : ss){
            System.out.println(st + " : " + st.ordinal());
        }
    }
}
