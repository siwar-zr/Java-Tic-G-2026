//final - variable (constante)/method (ne peut plus etre redéfinie -- pas de overriding)/class (ne peut plus etre héritée)

class Calcul{
    public final void show(){
        System.out.println("By John");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class AdvCalcul extends Calcul{
//    public void show(){
//        System.out.println("By Mark");
//    }
}
public class Demo {
    public static void main(String[] args) {

        final int num = 8;
        //num = 9;
        //System.out.println(num);

        AdvCalcul obj = new AdvCalcul();
        obj.show();
        obj.add(4,5);

    }
}
