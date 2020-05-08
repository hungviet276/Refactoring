import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static final char RESULT = '=';


    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstNumber = 1;
        int secondNumber = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstNumber, secondNumber, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstNumber = 2;
        int secondNumber = 1;
        char operator = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstNumber, secondNumber, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstNumber = 2;
        int secondNumber = 2;
        char operator = MULTIPLICATION;
        int expected = 4;

        int result = Calculator.calculate(firstNumber, secondNumber, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstNumber = 6;
        int secondNumber = 3;
        char operator = DIVISION;
        int expected = 2;

        int result = Calculator.calculate(firstNumber, secondNumber, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstNumber = 2;
        int secondNumber = 0;
        char operator = CalculatorTest.DIVISION;

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstNumber, secondNumber, operator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstNumber = 2;
        int secondNumber = 0;
        char operator = RESULT;

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstNumber, secondNumber, operator);});
    }
}