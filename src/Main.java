class Mobile{

    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
    }
}

public class Main {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand="Apple";
        m1.price=1900;
        //m1.type="Smartphone";

        Mobile m2 = new Mobile();
        m2.brand="Samsung";
        m2.price=2900;
        //m2.type="Smartphone";

        //m2.type="Phone";

        Mobile m3 = new Mobile();
        m3.brand="Hwawei";
        m3.price=2900;
        //m3.type="Smartph";

        Mobile.type = "Smartphone";
        Mobile.show1(m1);

//        m1.show();
//        m2.show();
//        m3.show();


    }
}