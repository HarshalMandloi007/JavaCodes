package exceptionHandling;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionExample3Test {
ExceptionExample3 ee = new ExceptionExample3();

    @Test
    public void should_not_throw_not_eligible_exception(){
    assertEquals(20, ee.validateAge(20));
}

@Test(expected = NotEligibleException.class)
    public void should_throw_not_eligible_exception(){
    assertEquals(13,ee.validateAge(13));
}
}