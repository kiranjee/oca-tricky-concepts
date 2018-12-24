public class InterfaceCast {
    public static void main(String[] args) {
        InterfaceCast s = new SubClass();

        ((SubClass)s).up();
      	((myInterface)s).up();
        ((myInterface)(SubClass)s).up();
      
      	//s.up();

    }
}
class SubClass extends InterfaceCast implements myInterface{
    public void up(){
        System.out.println("UP UP UP");
    }
}
interface myInterface{
    void up();
}
