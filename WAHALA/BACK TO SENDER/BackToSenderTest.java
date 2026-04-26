import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{
    @Test
    public void testLessThanFiftyPercent(){
    assertEquals(9000, BackToSender.calculateWage(25));
    }

    @Test
    public void testFiftyToFiftyNinePercent(){
    assertEquals(15000, BackToSender.calculateWage(50));
    }

    @Test
    public void testSixtyToSixtyNinePercent(){
    assertEquals(20000, BackToSender.calculateWage(60));
    }

    @Test
    public void testSeventyAbove(){
    assertEquals(45000, BackToSender.calculateWage(80));
    }

}
