package TestExample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SC2Test {
    @Test
    public void should_print_the_value_of_sc2(){
    SC2 sc2 = new SC2();
    assertEquals(12,sc2.start());
    }
}