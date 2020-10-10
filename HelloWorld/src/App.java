public class App {

    static int a = m1(); 
     
    // static method 
    static int m1() { 
        return 20; 
    } 

    // static block 
    static { 
        System.out.println("Inside static block"); 
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Value of a: " + a);
        System.out.println("From main()");
    }
}
