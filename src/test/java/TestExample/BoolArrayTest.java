package TestExample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoolArrayTest {

    @Test
    public void should_test_the_condition(){
        BoolArray boolArray = new BoolArray();
       boolArray.set(boolArray.b,0);
       boolArray.set(boolArray.b, 2);
       boolArray.test();
       assertEquals(3,boolArray.getCount());
    }

}