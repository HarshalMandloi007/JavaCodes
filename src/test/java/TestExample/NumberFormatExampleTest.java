package TestExample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberFormatExampleTest {
@Test
    public void should_format_the_number() {
    NumberFormatExample numberFormatExample = new NumberFormatExample();
    assertEquals(43, numberFormatExample.test());
}

}