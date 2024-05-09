public class Learn_Static {
    //create a class inside
    class A{
        String s;
        A(String s)
        {
            this.s = s;
        }
    }

    public static void main(String[] args) {

      //  A a = b.new A("Gopi");  //THis will give you error becuase this is dependent on the other class


      //Now you are calling the other class and inner class
        // Learn_Static b = new Learn_Static();
        // A a = b.new A("Gopi"); 
        // System.out.println(a.s);

        //You can make the inner class to static to use them because it doesnot depends on anythiing - Independent as we are writing outside
        A a = b.new A("Gopi");
    }
}
