import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Good {
    public static void Good(String input) {

        Pattern pattern = Pattern.compile("Good(\\w*)");
        Matcher matcher = pattern.matcher(input);
        String newStr = matcher.replaceAll("Хорошо");
        System.out.println(newStr);
        }
    }

