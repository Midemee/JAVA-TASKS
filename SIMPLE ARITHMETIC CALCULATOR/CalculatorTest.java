import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest{
    
//    @Test
//    public void testThatTheMultiplicationOfTwoNumbersGivesCorrectResult(){
//    int result = Calculator.arithmeticCalculator("*");
//    assertEquals(15, result);
//    }
    
    @Test
    public void testThatTheSMultiplicationOfTwoNumbersGivesCorrectResult(){
   
    int result = Calculator.multiplication(5, 3);
    assertEquals(15, result);
    }


    @Test
    public void testThatTheAdditionOfTwoNumbersGivesCorrectResult(){
   
    int result = Calculator.addition( 5, 3);
    assertEquals(8, result);
    }
    
    @Test
    public void testThatTheSubtractionOfTwoNumbersGivesCorrectResult(){
   
    int result = Calculator.subtraction( 5, 3);
    assertEquals(2, result);
    }
    
    @Test
    public void testThatTheDivisionOfTwoNumbersGivesCorrectResult(){
   
    int result = Calculator.division( 5, 3);
    assertEquals(1, result);
    }
    
    @Test
    public void testThatIfIDivideANumberByZeroArithmeticExceptionIsThrown(){
    assertThrows(ArithmeticException.class, () -> Calculator.division(15, 0));
    }
    
    @Test
    public void testThatTheOperatorMultiplicationOfTwoNumbersGivesCorrectResult(){
    Calculator.number1 = 5;
    Calculator.number2 = 12; 
   
    int result = Calculator.arithmeticCalculator("*");
    assertEquals(60, result);
    } 
    
    @Test
    public void testThatTheOperatorSubtractionOfTwoNumbersGivesCorrectResult(){
    Calculator.number1 = 20;
    Calculator.number2 = 5; 
   
    int result = Calculator.arithmeticCalculator("-");
    assertEquals(15, result);
    } 
    
    @Test
    public void testThatTheOperatorAdditionOfTwoNumbersGivesCorrectResult(){
    Calculator.number1 = 30;
    Calculator.number2 = 20; 
   
    int result = Calculator.arithmeticCalculator("+");
    assertEquals(50, result);
    } 
    
    @Test
    public void testThatTheOperatorDivisionOfTwoNumbersGivesCorrectResult(){
    Calculator.number1 = 50;
    Calculator.number2 = 2; 
   
    int result = Calculator.arithmeticCalculator("/");
    assertEquals(25, result);
    } 
}
