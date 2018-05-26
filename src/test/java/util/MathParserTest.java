package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathParserTest {

    @Test
    public void mathParser() {
        String string = "123.456 + 789.123 * 456.789 / 123.456 - 789.123";
        double expected = 123.456 + ((789.123 * 456.789) / 123.456) - 789.123;

        String actual = MathParser.mathParser(string);

        assertEquals(string, String.valueOf(expected), actual);
    }

    @Test
    public void validCharacters(){
        assertTrue(MathParser.validCharacters(" 0123456789+-*/."));

        assertFalse(MathParser.validCharacters(" abcdef"));
    }

    @Test
    public void isCorrectExpression(){
        assertFalse(MathParser.isCorrectExpression("123"));
        assertFalse(MathParser.isCorrectExpression("123+++"));
        assertFalse(MathParser.isCorrectExpression("+++123"));

        assertTrue(MathParser.isCorrectExpression("123 + 123"));
        assertTrue(MathParser.isCorrectExpression("123 + +123"));
        assertTrue(MathParser.isCorrectExpression("123 + -123"));
        assertFalse(MathParser.isCorrectExpression("123 + + 123"));
        assertFalse(MathParser.isCorrectExpression("123 + - 123"));
        assertFalse(MathParser.isCorrectExpression("123 + + +123"));
        assertFalse(MathParser.isCorrectExpression("123 + - -123"));

        assertTrue(MathParser.isCorrectExpression("123 - 123"));
        assertTrue(MathParser.isCorrectExpression("123 - +123"));
        assertTrue(MathParser.isCorrectExpression("123 - -123"));
        assertFalse(MathParser.isCorrectExpression("123 - + 123"));
        assertFalse(MathParser.isCorrectExpression("123 - - 123"));
        assertFalse(MathParser.isCorrectExpression("123 - + +123"));
        assertFalse(MathParser.isCorrectExpression("123 - - -123"));

        assertTrue(MathParser.isCorrectExpression("123 * 123"));
        assertTrue(MathParser.isCorrectExpression("123 * +123"));
        assertTrue(MathParser.isCorrectExpression("123 * -123"));
        assertFalse(MathParser.isCorrectExpression("123 * + 123"));
        assertFalse(MathParser.isCorrectExpression("123 * - 123"));
        assertFalse(MathParser.isCorrectExpression("123 * + +123"));
        assertFalse(MathParser.isCorrectExpression("123 * - -123"));

        assertTrue(MathParser.isCorrectExpression("123 / 123"));
        assertTrue(MathParser.isCorrectExpression("123 / +123"));
        assertTrue(MathParser.isCorrectExpression("123 / -123"));
        assertFalse(MathParser.isCorrectExpression("123 / + 123"));
        assertFalse(MathParser.isCorrectExpression("123 / - 123"));
        assertFalse(MathParser.isCorrectExpression("123 / + +123"));
        assertFalse(MathParser.isCorrectExpression("123 / - -123"));
    }
}