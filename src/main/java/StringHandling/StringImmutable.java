package StringHandling;


public class StringImmutable {
    public static void main(String[] args) {
       String s = new String("Java");
       s.concat("Language");  //if we don't give any reference then actual string is present
       s = s.concat(" is a programming language"); //if we give any reference to that string than what we add on that string is also print
        System.out.println(s);
    }
}
