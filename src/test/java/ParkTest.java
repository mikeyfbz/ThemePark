import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Run Around", 1);
    }

    @Test
    public void parkHasAName(){
        assertEquals("Run Around", park.getName());
    }

}
