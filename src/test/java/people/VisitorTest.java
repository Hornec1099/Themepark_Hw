package people;

import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Whack-a-Mole", 4);
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canVisitAttraction(){
        visitor.addVisitedAttraction(rollerCoaster);
        assertEquals( 1 ,visitor.visitedAttractionsCount());
    }
}
