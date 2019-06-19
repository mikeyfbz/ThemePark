import Stalls.AlcoholStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AlcoholStallTest {

    AlcoholStall alcoholStall;

    @Before
    public void before(){
        alcoholStall = new AlcoholStall("Boozy Cow", "Barney", "Z1", 4);
    }

    @Test
    public void hasAName(){
        assertEquals("Boozy Cow", alcoholStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Barney", alcoholStall.getOwnerName());
    }

    @Test
    public void hasParkingSpace(){
        assertEquals("Z1", alcoholStall.getParkingSpace());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(12.50, alcoholStall.defaultPrice());
    }

    @Test
    public void chargesSamePriceRegardlessOfVisitor(){
        Visitor visitor = new Visitor(20, 170, 50);
        assertEquals(12.50, alcoholStall.priceFor(visitor));
    }

    @Test
    public void visitorsMustBeOver18(){
        Visitor visitor = new Visitor(16, 150, 40);
        assertEquals(false, alcoholStall.isAllowedTo(visitor));
    }
}
