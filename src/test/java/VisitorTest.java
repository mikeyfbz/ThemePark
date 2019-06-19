import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {


    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 6.1, 20.00);
    }

    @Test
    public void hasAnAge(){
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void hasAHeight(){
        assertEquals(6.1, visitor.getHeight());
    }

    @Test
    public void hasSomeMoney(){
        assertEquals(20.00, visitor.getMoney());
    }
}
