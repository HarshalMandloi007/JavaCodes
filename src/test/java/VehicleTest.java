import junit.framework.TestCase;
import org.junit.Test;

public class VehicleTest extends TestCase {

    @Test
    public void testStart() {
        Car c= new Car();
        assertEquals("Car start with key",c.start());

        Bike b = new Bike();
        assertEquals("Bike start with kick",b.start());
    }

}