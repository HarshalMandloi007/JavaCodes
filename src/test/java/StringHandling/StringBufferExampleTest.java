package StringHandling;

import junit.framework.TestCase;
import org.junit.Test;

public class StringBufferExampleTest extends TestCase {
    @Test
    public void testStringBufferAppend(){
        StringBuffer sb = new StringBuffer("This is a Java");
        sb.append(" programming");
        assertEquals("This is a Java programming", sb.toString());
    }
@Test
    public void testStringBufferInsert(){
        StringBuffer sb = new StringBuffer("This is a java programming");
        sb.insert(4,",");
        assertEquals("This, is a java programming", sb.toString());
    }
@Test
    public void testStringBufferReplace(){
        StringBuffer sb = new StringBuffer("This is a java programming");
        sb.replace(0,4, "It");
        assertEquals("It is a java programming", sb.toString());
    }

    @Test
    public void testStringBufferDelete(){
        StringBuffer sb = new StringBuffer("This is a java programming");
        sb.delete(7,9);
        assertEquals("This is java programming",sb.toString());
    }
}