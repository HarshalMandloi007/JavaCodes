package TestExample;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


public class BitwiseTest  {
    Bitwise bitwise = new Bitwise();

    @Test
    public void should_return_bitwise_operator_value()
    {

        Optional<Integer> bInteger = new Bitwise().returnBitwiseOperatorValue();
            assertEquals(14,(int) bInteger.get());

    }
    }
