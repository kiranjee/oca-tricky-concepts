public class InheritTest extends A {
  
  final int i=4;
  int j=5;
  
   public static void main(String[] args){
      new InheritTest();
      
   }
   
   void print() { System.out.println(i+j); }
  
}
class A{
   A() {  print();   }
   void print() { System.out.println("A"); }
}
