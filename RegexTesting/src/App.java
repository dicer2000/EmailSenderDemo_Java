import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) throws Exception {

        // Example 1 with simple string matching
        System.out.println("Answer is: " + isNoNumberAtBeginning("george"));

        // Example 2 with more complex pattern matcher
        String exampleText = "We're in this together. Keeping you securely connected wherever you are.";

        Pattern pattern = Pattern.compile("\\w+");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(exampleText);
        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }


        // Example 3 where we can match and replace
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(exampleText);
        System.out.println(matcher2.replaceAll("\t"));
    }

    static boolean isTrue(String s) {
        return s.matches("true");
    }

    static boolean isTrueOrYes(String s) {
        return s.matches("[tT]rue|[yY]es");
    }

    static boolean isThreeLetters(String s){
        return s.matches("[a-zA-Z]{3}");
        // simpler from for
//      return s.matches("[a-Z][a-Z][a-Z]");
    }

    static boolean isNoNumberAtBeginning(String s){
        return s.matches("^[^\\d].*");
    }

}
