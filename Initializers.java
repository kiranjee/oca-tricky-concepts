public class Initializers extends A{

    static{
        System.out.println("In child static initializer");
    }
    Initializers(){
        System.out.println("In child constructor");
    }
    {
        System.out.println("In child instance initializer");
    }
    public static void main(String []args) throws Exception{
        
        System.out.println("Main");
        Initializers b1 = new Initializers();
        Initializers b2 = new Initializers();
        
     }
     
    
     
}

class A{
    static{
        System.out.println("In A's static initializer");
    }
    A(){
        System.out.println("In A's constructor");
    }
    {
        System.out.println("In A's instance initializer");
    }
}
