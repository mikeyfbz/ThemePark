import Stalls.IceCreamStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice To Meet You", "Mr Freeze", "G6", 2);
    }

    @Test
    public void hasAName(){
        assertEquals("Ice To Meet You", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Mr Freeze", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpace(){
        assertEquals("G6", iceCreamStall.getParkingSpace());
    }

    @Test
    public void hasADefaultPrice(){
        assertEquals(2.80, iceCreamStall.defaultPrice());
    }

    @Test
    public void returnsSamePriceRegardlessOfVisitor(){
        Visitor visitor = new Visitor(20, 150, 50);
        assertEquals(2.80, iceCreamStall.priceFor(visitor));
    }
}
