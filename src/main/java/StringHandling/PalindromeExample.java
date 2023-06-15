package StringHandling;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String s = sc.next();
        String rev = "";
     for (int i=s.length()-1;i>=0;i--)
     {
        rev += s.charAt(i);
     }
        if(s.equalsIgnoreCase(rev))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
