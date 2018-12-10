public class InterfaceCasting{

     public static void main(String []args){
        
        Car car = new Car();
        Bus bus = new Bus();        
        
        //Movable mover1 = (Movable)bus;
        Movable mover2 = (Movable)car;
               
     }
}

interface Movable{
    
}

class Vehicle{
    
}

class Car extends Vehicle{
    
}

final class Bus extends Vehicle{
    
}
