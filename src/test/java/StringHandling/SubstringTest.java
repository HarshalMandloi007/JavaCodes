package StringHandling;

import junit.framework.TestCase;
import org.junit.Test;

public class SubstringTest extends TestCase {
    @Test
    public void testSubstringFromToIndex() {
        String s1 = "Java is a programming language";
        assertEquals("a i", s1.substring(3, 6));
    }

    @Test
    public void testSubstringFromIndex(){
        String s1 = "Java is a programming language";
        assertEquals(" a programming language",s1.substring(7));
    }

    @Test
    public void testSubSequence() {
        String s1 = "Java is a programming language";
        assertEquals("a i", s1.subSequence(3, 6));
    }
}