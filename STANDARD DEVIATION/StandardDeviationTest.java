import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testThatArrayNumbersReturnsCorrectMean(){
    int [] numbers = {8, 2, 6, 5, 3, 4};
    double expected = 4.66;
    double actual = StandardDeviation.calculateMean(numbers);
    assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testThatNegativeArrayNumbersReturnsCorrectMean(){
    int [] numbers = {-10, -5, -3};
    double actual = StandardDeviation.calculateMean(numbers);
    assertEquals(-6.0, actual, 0.01);
    }
    
    @Test
    public void testThatPositiveAndNegativeArrayNumbersReturnsCorrectMean(){
    int [] numbers = {0, -5, 5};
    double actual = StandardDeviation.calculateMean(numbers);
    assertEquals(-0.0, actual, 0.01);
    }
    
    @Test
    public void testThatAnArrayReturnsTheStandardDeviation(){
    int [] numbers = {2, 3, 4, 1};
    double actual = StandardDeviation.calculateMeanDeviation(numbers);
    assertEquals(1.118, actual, 0.01);
    }
}
