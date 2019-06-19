import Attractions.Dodgems;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumpers", 3);
    }

    @Test
    public void dodgemsHasAName(){
        assertEquals("Bumpers", dodgems.getName());
    }

    @Test
    public void dodgemsHasADefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice());
    }

    @Test
    public void dodgemsChargesHalfPriceForUnder12(){
        Visitor visitor = new Visitor(10, 150, 20);
        assertEquals(2.25, dodgems.priceFor(visitor));
    }

}
