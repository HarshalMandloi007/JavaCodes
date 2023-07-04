package TestExample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XTestTest {
@Test
    public void should_throw_bad_method(){
    XTest t = new XTest();
    assertEquals("BDE",t.test());
}
}