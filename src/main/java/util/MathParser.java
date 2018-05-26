package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathParser {

    private final static Pattern PATTERN_1 = Pattern.compile("([?(+)|(\\-)]?\\d+\\.?\\d*\\s*[*/]\\s*[+-]?\\d+\\.?\\d*)");
    private final static Pattern PATTERN_2 = Pattern.compile("([?(+)|(\\-)]?\\d+\\.?\\d*\\s*[+\\-]\\s*[+-]?\\d+\\.?\\d*)");

    public static String mathParser(String expression) {
        String result = expression;
        Matcher matcher = PATTERN_1.matcher(expression);
        if (matcher.find()) {
            if (matcher.group().matches(".*\\*.*")) {
                String mul = Calculator.mul(matcher.group());
                return mathParser(expression.replace(matcher.group(), mul));
            }
            if (matcher.group().matches(".*/.*")) {
                String div = Calculator.div(matcher.group());
                return mathParser(expression.replace(matcher.group(), div));
            }
        }
        Matcher matcher1 = PATTERN_2.matcher(expression);
        if (matcher1.find()) {
            if (matcher1.group().matches(".*\\+.*")) {
                String mul = Calculator.sum(matcher1.group());
                return mathParser(expression.replace(matcher1.group(), mul));
            }
            if (matcher1.group().matches(".*-.*")) {
                String div = Calculator.sub(matcher1.group());
                return mathParser(expression.replace(matcher1.group(), div));
            }
        }
        return result;
    }

    public static boolean isCorrectExpression(String expression) {
        if (!validCharacters(expression)){
            return false;
        }
        if (!expression.matches(".*\\d([+\\-*/\\s]+)\\d.*")){
            return false;
        }
        Pattern pattern = Pattern.compile("\\d([+\\-*/\\s]+)\\d");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()){
            if (!validOperator(matcher.group(1))){
                return false;
            }
        }
        return true;
    }

    private static boolean validOperator(String expression) {
        if (expression.matches("\\s*[+\\-*/]\\s*")) {
            return true;
        } else if (expression.matches("\\s*[+\\-*/]\\s*\\+")) {
            return true;
        } else if (expression.matches("\\s*[+\\-*/]\\s*-")) {
            return true;
        }
        return false;
    }

    public static boolean validCharacters(String expression) {
        return expression.matches("[0-9+-\\\\*/\\s\\\\.]*");
    }
}
