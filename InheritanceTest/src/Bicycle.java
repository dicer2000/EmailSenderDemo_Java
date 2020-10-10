class Bicycle implements IBicycle  {  
    
    // the Bicycle class has two fields 
    protected int gear = 1; 
    protected int speed = 10; 

    // the Bicycle class has one constructor 
    public Bicycle(int gear, int speed) 
    { 
        
        this.gear = gear; 
        this.speed = speed; 
    } 
          
    // the Bicycle class has three methods 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("Wheels: " + WHEEL_COUNT
                +"\nNo of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
} 