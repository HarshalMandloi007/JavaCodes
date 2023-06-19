package TestExample;

import java.util.Optional;

public class Bitwise {

    public Optional<Integer> returnBitwiseOperatorValue()
    {
        int x = 11 & 9;
        int  y = x ^ 3;
       System.out.println( y | 12 );


        return Optional.of(y|12);
    }
}
