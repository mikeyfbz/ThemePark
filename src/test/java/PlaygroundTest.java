import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import ThemePark.Visitor;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Fun Ground", 2);
    }

    @Test
    public void playgroundHasAName(){
        assertEquals("Fun Ground", playground.getName());
    }

    @Test
    public void over15sAreNotAllowedIn(){
        Visitor visitor = new Visitor(20, 180, 30);
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
