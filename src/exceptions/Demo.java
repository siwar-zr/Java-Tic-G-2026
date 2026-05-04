package exceptions;

//Error :
//1) Compile Time Error
//2) Runtime Error => Exception Handling
//3) Logical Error

class ZeroResultException extends Exception {
    public ZeroResultException(String msg){
        super(msg);
    }
}

class A {
    public void show() throws ClassNotFoundException{
        /*try{
            Class.forName("Calc");
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find class");
        }*/
        Class.forName("Calc");
    }
    public void config() throws ClassNotFoundException{
        System.out.println("In config");
        this.show();
    }
}
public class Demo {
    public static void main(String[] args) {
        /*// System.out.println(5);
        int i = 20;
        int j = 0;

        //int[] nums = new int[5];
        //String str = null;

        try{
            j = 18/i; // Ligne critique
            if (j == 0){
                throw new ZeroResultException("Result j cannot be 0");
            }
            //System.out.println(str.length());
            //System.out.println(nums[1]);
            //System.out.println(nums[5]);
        }
        catch(ZeroResultException e){
            j = 18;
            System.out.println("This is the default value : " + e.getMessage());
        }
        *//*catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in ur limit : " + e.getMessage());
        }*//*
        catch(Exception e){
            System.out.println("Something went wrong.." + e);
        }
        System.out.println(j);
        System.out.println("Bye");*/

        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find class");
        }

        try{
            obj.config();
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find class in config");
        }



    }

}
