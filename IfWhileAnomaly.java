public class IfWhileAnomaly {
    
    public static void main(String args[]) {
        
        final boolean b = false;
        
        if(b){
            System.out.println("here");   
        }
        while(b){
            System.out.println("here 2");  
        }
        
    }
}
