
public class App {
    public static void main(String[] args) throws Exception {
        
        Bicycle b = null;
        b = new ThreeSpeed(10, 35, true);

        System.out.println(b.toString());

    }
}
