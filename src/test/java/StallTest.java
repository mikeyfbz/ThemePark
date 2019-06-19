import Stalls.IceCreamStall;
import Stalls.Stall;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StallTest {

    @Test
    public void stallAsAIceCreamStall(){
        Stall stall = new IceCreamStall("Ice To Meet You", "Mr Freeze", "G6", 3);
        assertEquals("Ice To Meet You", stall.getName());
    }
}
