package exceptionHandling;

import java.util.Scanner;
 class InvalidAgeException extends Exception{
     InvalidAgeException(String msg)   {
         super(msg);
     }
 }
public class ExceptionExample4 {
    static void validateAge(int age) throws InvalidAgeException{
        if (age<18)
        {
            throw new InvalidAgeException("Exception");
        }
        System.out.println("Valid Age for vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        try
        {
            validateAge(a);
        }
        catch (InvalidAgeException i)
        {
            System.out.println("You are not eligible for vote");
        }
    }
}
                                                                                      