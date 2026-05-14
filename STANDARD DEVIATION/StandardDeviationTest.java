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
    public void testThatAnArrayReturnsCorrectStandardDeviation(){
    int [] numbers = {2, 3, 4, 1};
    double actual = StandardDeviation.calculateStandardDeviation(numbers);
    assertEquals(1.118, actual, 0.01);
    }
    
    @Test
    public void testThatNegativeArrayNumbersReturnsCorrectStandardDeviation(){
    int [] numbers = {-5, -3, -1};
    double actual = StandardDeviation.calculateStandardDeviation(numbers);
    assertEquals(1.63, actual, 0.01);
    }
    
    @Test
    public void testThatNumberInAnArrayReturnsCorrectSumOfSquaredDifferences() {
    int[] numbers = {2, 4, 4, 4, 5, 5, 7, 9};
    double actual = StandardDeviation.sumOfSquared(numbers);
    assertEquals(32.0, actual, 0.01);
    }
    
    @Test
    public void testThatNegativeArrayNumbersReturnCorrectSumOfSquaredDifferences() {
    int[] numbers = {-5, -3, -1};
    double actual = StandardDeviation.sumOfSquared(numbers);
    assertEquals(8.0, actual, 0.01);
    }
}
