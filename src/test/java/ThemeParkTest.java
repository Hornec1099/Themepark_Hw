import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Visitor visitor;
    @Before
    public void before() {
        themePark = new ThemePark("LegoLand");
        rollerCoaster =new RollerCoaster("Whack-a-Mole", 2);
        visitor =new Visitor(25, 180.00, 200.00);
    }


    @Test
    public void canGetAllReviewed(){
        themePark.addFacility(rollerCoaster);
        assertEquals(Arrays.asList(rollerCoaster),themePark.getFacilities());
    }
    @Test
    public void canAddVisit(){
        themePark.addVisitToAttraction(visitor, rollerCoaster);
        assertEquals(1 , visitor.visitedAttractionsCount());
        assertEquals(1, rollerCoaster.getVisitCount());

    }

}
