package TestExample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test138Test {
    @Test
    public void should_change_the_string() {
        String textString = new String("java");
        Test138.stringReplace(textString);
        assertEquals("java", textString);
    }

    @Test
    public void should_change_the_string_buffer() {
        StringBuffer textbuffer = new StringBuffer("java");
        Test138.bufferReplace(textbuffer);
        assertEquals("javac", textbuffer.toString());
    }
}