package Singleton;

public class Main {
    public static void main(String[] args) {
        //Single_ton s = new Single_ton(); // This will give you error if constructor is private

        //Now I want one instance
        // Create a static  method in the singleton file
        Single_ton s = Single_ton.get_instance();
        System.out.println(s);
        Single_ton s2 = Single_ton.get_instance();
        System.out.println(s2);
        

        // Observe the print message both will have the same instance
    }
}
