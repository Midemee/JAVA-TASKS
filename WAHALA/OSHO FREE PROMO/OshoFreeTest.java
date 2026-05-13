import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreeTest{

    @Test
    public void testThatCartTotal5000AboveApplies10perecentDiscount(){
    double cartTotal = 5000;
    String promoCode = "STARTER10";
    double expected = 4500;
    double actual = OshoFree.calculateFinalPrice(cartTotal, promoCode);
    assertEquals(actual, expected);
    }
    
    @Test
    public void testThatCartTotal5000AboveWithFakeCodeReturnsOriginalTotal(){
    double result = OshoFree.calculateFinalPrice(5500, "FAKE99");
    assertEquals(5500, result);
    }
     
    @Test
    public void testThatCartTotal15000AboveApplies20PercentDiscount(){
    double actual = OshoFree.calculateFinalPrice(15000, "BIGBOY20");
    assertEquals(12000, actual);
    }
    
    @Test
    public void testThatCartTotal15000AboveWithFakeCodeReturnsOriginalTotal(){
    double result = OshoFree.calculateFinalPrice(18500, "FAKE99");
    assertEquals(18500, result);
    }
    
    @Test
    public void testThatCartTotal30000AboveApplies35PercentDiscount(){
    double result = OshoFree.calculateFinalPrice(30000, "OSHOFREE35");
    assertEquals(19500, result);
    }
    
    @Test
    public void testThatCartTotal30000AboveWithFakeCodeReturnsOriginalTotal(){
    double result = OshoFree.calculateFinalPrice(32000, "FAKE99");
    assertEquals(32000, result);
    }
    
    @Test
    public void testThatCartTotalBelow5000AppliesZeroDiscountAndReturnsOriginalTotal(){
    double result = OshoFree.calculateFinalPrice(4999, "STARTER10");
    assertEquals(4999, result);
    }
    
    @Test
    public void testThatCartTotalBelow5000WithFakeCodeReturnsOriginalTotal(){
    double result = OshoFree.calculateFinalPrice(3000, "FAKE99");
    assertEquals(3000, result);
    }
    
    @Test
    public void testThatZeroCartTotalReturnsTheOrginalCartTotal(){
    double result = OshoFree.calculateFinalPrice(0, "STARTER10");
    assertEquals(0, result);
    }
    
    @Test
    public void testThatNegativeCartTotalThrowsExceptionInvalid(){
    assertThrows(IllegalArgumentException.class, () -> OshoFree.calculateFinalPrice(-500,"BIGBOY20"));
    }

}
