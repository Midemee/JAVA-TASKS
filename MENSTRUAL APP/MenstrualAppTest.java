import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest{

    @Test
    public void testThatIfIEnterMyLastPeriodDateIWillGetMyNextPeriodDate(){

        int[] result = MenstrualApp.calculateNextPeriod(1, 4, 2026, 28);
        assertEquals(29, result[0]); 
        assertEquals(4,  result[1]); 
        assertEquals(2026, result[2]); 
    }

    @Test
    public void testThatTheNextPeriodRollsOverToNextMonth() {

        int[] result = MenstrualApp.calculateNextPeriod(20, 4, 2026, 28);
        assertEquals(18, result[0]);
        assertEquals(5,  result[1]);
        assertEquals(2026, result[2]);
    }

    public void testThatTheNextPeriodRollsOverToNextYear() {

        int[] result = MenstrualApp.calculateNextPeriod(20, 12, 2026, 28);
        assertEquals(17, result[0]);
        assertEquals(1,  result[1]);
        assertEquals(2027, result[2]);
    }

    @Test
    public void testThatTheCurrentPeriodDateIsLeapYearandRollsOverToNextMonth() {

        int[] result = MenstrualApp.calculateNextPeriod(10, 2, 2028, 28);
        assertEquals(9,  result[0]);
        assertEquals(3,  result[1]);
        assertEquals(2028, result[2]);
    }


}







