package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;


    @Before
    public void setUp() {
        visitor = new Visitor(20, 140, 20.00);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, visitor);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canNotGoOnRide(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void willCostTheNormalAmount(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }
}
