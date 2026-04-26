import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest {

    @Test
    public void testLessThanFiftyPercent() {
        int deliveries = 25;
        int result = BackToSender.calculateWage(deliveries);
        int expected = 9000;
        assertEquals(expected, result);
    }

    @Test
    public void testFiftyToFiftyNinePercent() {
        int deliveries = 50;
        int result = BackToSender.calculateWage(deliveries);
        int expected = 15000;
        assertEquals(expected, result);
    }

    @Test
    public void testSixtyToSixtyNinePercent() {
        int deliveries = 60;
        int result = BackToSender.calculateWage(deliveries);
        int expected = 20000; 
        assertEquals(expected, result);
    }

    @Test
    public void testSeventyPercentAndAbove() {
        int deliveries = 80;
        int result = BackToSender.calculateWage(deliveries);
        int expected = 45000;
        assertEquals(expected, result);
    }
}
