
public class App {

    public static int count = 0;

    public void increment() {
        count++;
    }
    public static void main(String[] args) throws Exception {

        App obj1 = new App();
        App obj2 = new App();

        obj1.increment();
        obj2.increment();

        System.out.println("Obj1 count: " + obj1.count);
        System.out.println("Obj2 count: " + obj2.count);

        
    }
}
