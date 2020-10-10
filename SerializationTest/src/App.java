import java.io.*; 
  
class SerializationDemo implements java.io.Serializable 
{ 
    public int a; 
    public String b; 
  
    // Default constructor 
    public SerializationDemo(int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
} 

public class App {
    public static void main(String[] args) throws Exception {
        
        SerializationDemo object = new SerializationDemo(1, "geeksforgeeks"); 
        String filename = "file.ser"; 

        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(object); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        
    }
}


/*
// Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (Demo)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object1.a); 
            System.out.println("b = " + object1.b); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 

*/