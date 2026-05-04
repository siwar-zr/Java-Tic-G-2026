package functionalInterface;

@FunctionalInterface
interface A{
    int add(int i,int j);
    //void show(int a, int b);
    //void run();
}

/*class B implements A{
    @Override
    public void show() {
        System.out.println("In B show");
    }
}*/
public class Demo {
    public static void main(String[] args) {
        //A obj = (a,b) -> System.out.println("In Show : " + (a+b));
        //obj.show(5,1);
        A obj = (i,j) -> i+j;

        System.out.println(obj.add(5,3));
    }
}
