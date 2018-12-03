public class ForwardReferenceMethod{

    {
        printI();
    }
    
    void printI(){
        System.out.println(i);
    }
    
    int i = 10;
    
     public static void main(String []args){
        
        
        new ForwardReferenceMethod();
     }
}
