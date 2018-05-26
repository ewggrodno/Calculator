package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum_1() {
        String a = "456.456";
        String b = "+";
        String c = "789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_2() {
        String a = "456.456";
        String b = " + ";
        String c = "789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_3() {
        String a = "456.456";
        String b = "  +  ";
        String c = "789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_4() {
        String a = "+456.456";
        String b = "+";
        String c = "+789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_5() {
        String a = "+456.456";
        String b = " + ";
        String c = "+789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_6() {
        String a = "+456.456";
        String b = "  +  ";
        String c = "+789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_7() {
        String a = "-456.456";
        String b = "+";
        String c = "-789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_8() {
        String a = "-456.456";
        String b = " + ";
        String c = "-789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sum_9() {
        String a = "-456.456";
        String b = "  +  ";
        String c = "-789.789";

        String actual = Calculator.sum(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_1() {
        String a = "456.456";
        String b = "-";
        String c = "789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_2() {
        String a = "456.456";
        String b = " - ";
        String c = "789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_3() {
        String a = "456.456";
        String b = "  -  ";
        String c = "789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_4() {
        String a = "+456.456";
        String b = "-";
        String c = "+789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_5() {
        String a = "+456.456";
        String b = " - ";
        String c = "+789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_6() {
        String a = "+456.456";
        String b = "  -  ";
        String c = "+789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_7() {
        String a = "-456.456";
        String b = "-";
        String c = "-789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_8() {
        String a = "-456.456";
        String b = " - ";
        String c = "-789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void sub_9() {
        String a = "-456.456";
        String b = "  -  ";
        String c = "-789.789";

        String actual = Calculator.sub(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_1() {
        String a = "456.456";
        String b = "*";
        String c = "789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_2() {
        String a = "456.456";
        String b = " * ";
        String c = "789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_3() {
        String a = "456.456";
        String b = "  *  ";
        String c = "789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_4() {
        String a = "+456.456";
        String b = "*";
        String c = "+789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_5() {
        String a = "+456.456";
        String b = " * ";
        String c = "+789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_6() {
        String a = "+456.456";
        String b = "  *  ";
        String c = "+789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_7() {
        String a = "-456.456";
        String b = "*";
        String c = "-789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_8() {
        String a = "-456.456";
        String b = " * ";
        String c = "-789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void mul_9() {
        String a = "-456.456";
        String b = "  *  ";
        String c = "-789.789";

        String actual = Calculator.mul(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_1() {
        String a = "456.456";
        String b = "/";
        String c = "789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_2() {
        String a = "456.456";
        String b = " / ";
        String c = "789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_3() {
        String a = "456.456";
        String b = "  /  ";
        String c = "789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_4() {
        String a = "+456.456";
        String b = "/";
        String c = "+789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_5() {
        String a = "+456.456";
        String b = " / ";
        String c = "+789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_6() {
        String a = "+456.456";
        String b = "  /  ";
        String c = "+789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_7() {
        String a = "-456.456";
        String b = "/";
        String c = "-789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_8() {
        String a = "-456.456";
        String b = " / ";
        String c = "-789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

    @Test
    public void div_9() {
        String a = "-456.456";
        String b = "  /  ";
        String c = "-789.789";

        String actual = Calculator.div(a + b + c);

        String expected = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));

        assertEquals(actual, expected);
    }

}