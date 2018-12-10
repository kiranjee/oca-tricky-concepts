public class OverrideWithStaticMethod{

     public static void main(String []args){
        System.out.println("Hello");
     }
     
    void moo(){}
}

class Abcd extends OverrideWithStaticMethod{
    static void moo(){}
}
