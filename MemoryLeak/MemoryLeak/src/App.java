// I have a bug.  Can you find me?

public class App {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();

        s.push(new String("Hello"));
        s.push(new String("I"));
        s.push(new String("am"));
        s.push(new String("a"));
        s.push(new String("Bug!"));

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }
}
