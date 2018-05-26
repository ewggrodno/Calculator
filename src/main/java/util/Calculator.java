package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private final static Pattern PATTERN
            = Pattern.compile("^([+-]?\\d+\\.?\\d*)(\\s*[+\\-*/]\\s*)([+-]?\\d+\\.?\\d*)$");

    public static String sum(String sum) {
        Matcher matcher = PATTERN.matcher(sum);
        matcher.find();
        double result = Double.parseDouble(matcher.group(1)) + Double.parseDouble(matcher.group(3));
        return String.valueOf(result);
    }

    public static String sub(String sub) {
        Matcher matcher = PATTERN.matcher(sub);
        matcher.find();
        double result = Double.parseDouble(matcher.group(1)) - Double.parseDouble(matcher.group(3));
        return String.valueOf(result);
    }

    public static String mul(String mul) {
        Matcher matcher = PATTERN.matcher(mul);
        matcher.find();
        double result = Double.parseDouble(matcher.group(1)) * Double.parseDouble(matcher.group(3));
        return String.valueOf(result);
    }

    public static String div(String div) {
        Matcher matcher = PATTERN.matcher(div);
        matcher.find();
        double result = Double.parseDouble(matcher.group(1)) / Double.parseDouble(matcher.group(3));
        return String.valueOf(result);
    }
}
