public class StaticVariableOnNullInstance{

     public static void main(String []args){
        Foo f = null;
        System.out.println(f.bar);
     }
}

class Foo{
    static String bar = "Foobar";
}
