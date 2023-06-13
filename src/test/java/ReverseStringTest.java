import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReverseStringTest {

    @Test
    public void should_reverse_string() {
        Optional<String> stringOptional = new ReverseString().returnEmptyIfNullElseReverse("rahul");
        assertTrue(stringOptional.isPresent());
        assertEquals("luhar", stringOptional.get());
    }

    @Test
    public void should_pass_since_exception_was_thrown() {
        Optional<String> stringOptional = new ReverseString().returnEmptyIfNullElseReverse(null);
        assertTrue(stringOptional.isEmpty());
    }
}