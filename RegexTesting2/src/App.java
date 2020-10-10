import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class App {
    public static void main(String[] args) throws Exception {

        String exampleText = "We're in this together. I've got your back";

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(exampleText);

        while(matcher.find()) {
            System.out.println("Start: " + matcher.start());
            System.out.println(" End: " + matcher.end() + " ");
            System.out.println(matcher.group());

        }









//        System.out.println(isNoNumberAtBeginning("2tssdkfasdf"));
    }

    static boolean isNoNumberAtBeginning(String s) {
        return s.matches("^[^\\d].*");
    }


    static boolean isTrue(String s) {
        return s.matches("[Tt]rue");
    }

    static boolean isTrueOrYes(String s) {
        return s.matches("[tT]rue|[yY]es");
    }

    static boolean isThreeLetters(String s) {
        return s.matches("[a-zA-Z]{3}");
    }



}
