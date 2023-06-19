package exceptionHandling;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionExampleTest  {


    @Test
    public void should_divide_and_return_result(){
        assertEquals(2,new ExceptionExample().divide(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void should_fail_due_to_divide_by_zero_exception(){
        new ExceptionExample().divide(4,0);
    }
}