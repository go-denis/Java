package CheckPolindrom;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Введите строку: ");
            String input = inputStream.readLine();
            System.out.print("Результат: ");
            System.out.print(isPalindrome(input));

        } catch (IOException exception) {
            System.err.println("Ошибка ввода");
        }
    }

    public static boolean isPalindrome(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find())
            builder.append(matcher.group());

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if(result.compareToIgnoreCase(reverseResult) == 0)
            return true;
        return false;
    }
}
