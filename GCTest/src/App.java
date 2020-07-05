

public class App {
    String name = "App Instance";
    
    public App() {
        System.out.println("In Constructor");
    }
    protected void finalize() throws Throwable {
        // will print name of object
        System.out.println(this.name + " successfully garbage collected");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Starting Up");

        App a = new App();
        a.name = "Bubba";

        a = null;

        System.gc();


    }
}
