import Attractions.Attraction;
import Attractions.RollerCoaster;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AttractionTest {

    @Test
    public void attractionAsARollerCoaster(){
        Attraction attraction = new RollerCoaster("Big Dipper", 3);
        assertEquals("Big Dipper", attraction.getName());
    }
}
