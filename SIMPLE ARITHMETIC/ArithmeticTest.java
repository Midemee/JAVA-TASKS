import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticTest {

    @Test
    public void testThatCheckAnswerReturnsTrueForCorrectAnswer() {
        boolean actual = Arithmetic.checkAnswer(10, 4, 6);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testThatCheckAnswerReturnsFalseForWrongAnswer() {
        boolean actual = Arithmetic.checkAnswer(10, 4, 5);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void testThatCalculateScoreReturnsCorrectPercentage() {
        double actual = Arithmetic.calculateScore(7, 10);
        double expected = 70.0;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testThatCalculateScoreReturns100ForPerfectScore() {
        double actual = Arithmetic.calculateScore(10, 10);
        double expected = 100.0;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testThatCalculateScoreReturns0ForNoCorrectAnswers() {
        double actual = Arithmetic.calculateScore(0, 10);
        double expected = 0.0;
        assertEquals(expected, actual, 0.0);
    }
}
