class Hello{
    public static void main(String[]args){
        int num = 5;
        byte by = 100;
        short sh = 500;
        long l = 1220;

        float f = 5.6f;
        double d = 125.36;

        char c = 'k';

        boolean b = true;

        //Literals

        int num1 = 0b101;
        int num2 = 0x7E;
        //System.out.println(num2);

        long num3 = 10_00_000_00;
        //System.out.println(num3);

        double num4 = 56;
        //System.out.println(num4);

        double d1 = 82596e10;
        //System.out.println(d1);

        char ch = 'a';
        ch++;
        //System.out.println(ch);

        //Type Conversion and Casting

        byte x = 127;
        int y = 500; //x = 520 % 256 (range du byte) qui peut etre negatif ou positif

        x= (byte)y; //Conversion explicite
        //y=x; //Conversion implicite
        //System.out.println(x);

        float f1 = 5.8f;
        int i = 0;
        //f1 = i; //Conversion implicite
        i = (int)f1;
        System.out.println(i);






    }
}


