import Attractions.RollerCoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Big Dipper", 5);
    }

    @Test
    public void rollerCoasterHasAName(){
        assertEquals("Big Dipper", rollerCoaster.getName());
    }

    @Test
    public void rollerCoasterHasADefault(){
        assertEquals(8.40, rollerCoaster.defaultPrice());
    }

    @Test
    public void rollerCoasterChargesDoubleForTallFolk(){
        Visitor visitor = new Visitor(18, 210, 40.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor));
    }

    @Test
    public void rollerCoasterRestrictsUnder12s(){
        Visitor visitor = new Visitor(11, 150, 20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void rollerCoasterRestrictsUnder145Height(){
        Visitor visitor = new Visitor(11, 140, 20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }
}
