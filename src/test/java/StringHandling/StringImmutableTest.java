package StringHandling;

import junit.framework.TestCase;
import org.junit.Test;

public class StringImmutableTest extends TestCase {

    @Test
    public void testStringConcatImmutable(){
        String s = new String("Java");
        s.concat("Language");
        assertEquals("Java",s);
    }

    @Test
    public void testStringConcatMutable(){
        String s = new String("Java");
        s = s.concat(" is a programming language");
        assertEquals("Java is a programming language", s);
    }


}