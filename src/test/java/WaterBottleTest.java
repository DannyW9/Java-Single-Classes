import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canTakeDrink(){
        assertEquals(90, bottle.takeDrink());
    }

    @Test
    public void canEmptyDrinkFromFull(){
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void canEmptyDrinkFromPartial(){
        bottle.takeDrink();
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void canFillBottleFromEmpty(){
        bottle.emptyBottle();
        assertEquals(100, bottle.fillBottle());
    }

    @Test
    public void canFillBottleFromPartial(){
        bottle.takeDrink();
        assertEquals(100, bottle.fillBottle());
    }

}
