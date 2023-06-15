import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest  {

    @Test
    public void should_start_car_and_bike() {
        Car c= new Car();
        assertEquals("Car start with key",c.start());

        Bike b = new Bike();
        assertEquals("Bike start with kick",b.start());
    }

}