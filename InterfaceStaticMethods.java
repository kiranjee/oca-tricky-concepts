public class InterfaceStaticMethods extends MyClass implements MyInterface{

    public static void main(String []args) throws Exception{
        
        InterfaceStaticMethods.myClassMethod();
        InterfaceStaticMethods.myInterfaceMethod();
        
     }
}

class MyClass{
    static void myClassMethod(){
        System.out.println("In myClassMethod");
    }
}

interface MyInterface{
    static void myInterfaceMethod(){
        System.out.println("In myInterfaceMethod");
    }
}
