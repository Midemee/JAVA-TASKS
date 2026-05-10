import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CycleCalculatorTest {

    @Test
    public void testThatNextPeriodDateIsCorrect() {
        int startDay = 2;
        int cycleLength = 28;

        int actualDay = CycleCalculator.calculateDay("Test", startDay, cycleLength);

        int expectedDay = 30;
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testThatOvulationDayIsCorrect() {
    
        int startDay = 2;
        int cycleLength = 28;
        int ovulationOffset = cycleLength - 14; 

        int actualDay = CycleCalculator.calculateDay("Test", startDay, ovulationOffset);

        int expectedDay = 16;
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testThatFertileStartIsCorrect() {

        int startDay = 2;
        int cycleLength = 28;
        int fertileOffset = (28 - 14) - 5;

        int actualDay = CycleCalculator.calculateDay("Test", startDay, fertileOffset);

        int expectedDay = 11;
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testThatSafePeriodStartIsCorrect() {

        int startDay = 2;
        int cycleLength = 28;
        int safeOffset = (28 - 14) + 2; 
        
        int actualDay = CycleCalculator.calculateDay("Test", startDay, safeOffset);

        int expectedDay = 18;
        assertEquals(expectedDay, actualDay);
    }
}
