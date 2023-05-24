package chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {
//        System.out.println(Character.isJavaIdentifierStart(36));
//        Character character = 'a';
//        Pattern pattern = Pattern.compile("JAVA");
//        Matcher matcher = pattern.matcher("JAVA SE");
//        System.out.println(matcher.matches());
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher("");

        while (matcher.find()){
            System.out.println("");
        }
    }
}
