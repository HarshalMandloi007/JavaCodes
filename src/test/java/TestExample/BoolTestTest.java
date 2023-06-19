package TestExample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class BoolTestTest {

   BoolTest boolTest = new BoolTest();

@Test
    public void should_check_output_for_boolean(){

    assertFalse(boolTest.checkBoolean());
}
}