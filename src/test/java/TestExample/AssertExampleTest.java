package TestExample;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AssertExampleTest {

    @Test(expected = AssertionError.class)
    public void should_fail(){
        AssertExample.shouldPass=false;
        new AssertExample().extracted();
    }
}