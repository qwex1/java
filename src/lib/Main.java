package lib;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String sort(String str){
        String[] splittedStr = str.split(" ");
        Arrays.sort(splittedStr, (o1, o2) -> o2.length() - o1.length());
        str = String.join(" ", splittedStr);
        return str;
    }
    public static boolean isPhone(String str){
        Pattern pattern = Pattern.compile("^\\+\\d\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
