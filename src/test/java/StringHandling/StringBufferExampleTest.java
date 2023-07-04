package StringHandling;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBufferExampleTest  {
    @Test
    public void should_append_the_string(){
        StringBuffer sb = new StringBuffer("This is a Java");
        sb.append(" programming");
        assertEquals("This is a Java programming", sb.toString());
    }
@Test
    public void should_insert_the_string(){
        StringBuffer sb = new StringBuffer("This is a java programming");
        sb.insert(4,",");
        assertEquals("This, is a java programming", sb.toString());
    }
@Test
    public void should_replace_the_string(){
        StringBuffer sb = new StringBuffer("This is a java programming");
        sb.replace(0,4, "It");
        assertEquals("It is a java programming", sb.toString());
    }

    @Test
    public void should_delete_the_string(){
        StringBuffer sb = new StringBuffer("This is a java programming");
        sb.delete(7,9);
        assertEquals("This is java programming",sb.toString());
    }
}