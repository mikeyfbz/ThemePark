import Stalls.CandyFlossStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Sticky Fingers", "Mrs Floss", "A6", 4);
    }

    @Test
    public void hasAName(){
        assertEquals("Sticky Fingers", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Mrs Floss", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpace(){
        assertEquals("A6", candyFlossStall.getParkingSpace());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice());
    }

    @Test
    public void chargesSamePriceRegardlessOfVisitor(){
        Visitor visitor = new Visitor(20, 170, 50);
        assertEquals(4.20, candyFlossStall.priceFor(visitor));
    }
}
