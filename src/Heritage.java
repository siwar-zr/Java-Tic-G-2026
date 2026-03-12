class Calc{

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}
/*
class A extends Object{


    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }

}
class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in B int");
    }
}
*/
class A{
    public void show(){
        System.out.println("In show A");
    }
    public void config(){
        System.out.println("In config A");
    }
}

class B extends A{

     public void show(){
         System.out.println("In show B");
     }

}



public class Heritage {
    public static void main(String[] args) {

        /*ScientCalc obj = new ScientCalc();
        int r1 = obj.add(5,4);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(3,2);
        int r4 = obj.div(5,2);
        double r5 = obj.power(4,2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);*/

        //B obj = new B(6);
/*
        B obj = new B();
        obj.show();
        obj.config();
*/
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(1,2));

    }
}
