import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheapestOrderTest {
    CheapestOrder cheapestOrder = new CheapestOrder();

    @Test
    @Ignore
    public void order_A1() {
        cheapestOrder.addItem("A");
        double expectedValue = 100;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A1_B1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        double expectedValue = 190;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A1_B1_C1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        cheapestOrder.addItem("C");
        double expectedValue = 270;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A1_B1_C1_D1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        cheapestOrder.addItem("C");
        cheapestOrder.addItem("D");
        double expectedValue = 320;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A1_B1_C1_D1_E1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        cheapestOrder.addItem("C");
        cheapestOrder.addItem("D");
        cheapestOrder.addItem("E");
        double expectedValue = 375;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A2() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("A");
        double expectedValue = 200;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A2_B1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        double expectedValue = 290;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A2_B1_C1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        cheapestOrder.addItem("C");
        double expectedValue = 370;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A2_B1_C1_D1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        cheapestOrder.addItem("C");
        cheapestOrder.addItem("D");
        double expectedValue = 420;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    @Ignore
    public void order_A2_B1_C1_D1_E1() {
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("A");
        cheapestOrder.addItem("B");
        cheapestOrder.addItem("C");
        cheapestOrder.addItem("D");
        cheapestOrder.addItem("E");
        double expectedValue = 640;
        double actualValue = cheapestOrder.getCheapestPrice();
        assertEquals(expectedValue, actualValue, 0);
    }
}
