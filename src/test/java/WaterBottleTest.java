import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void filledBottle() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkWater(){
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(60, waterBottle.getVolume());
    }

    @Test
    public void empty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillAgain(){
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}