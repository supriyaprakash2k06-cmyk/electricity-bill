import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ElectricityBillTest {

    @Test
    public void testBelow100Units() {
        assertEquals(150.0,
                ElectricityBill.calculateBill(100), 0.01);
    }

    @Test
    public void testBetween100And300() {
        assertEquals(400.0,
                ElectricityBill.calculateBill(200), 0.01);
    }

    @Test
    public void testAbove300() {
        assertEquals(850.0,
                ElectricityBill.calculateBill(350), 0.01);
    }
}