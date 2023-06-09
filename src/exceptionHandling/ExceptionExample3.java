package exceptionHandling;

import java.util.Scanner;

class NotEligibleException extends RuntimeException
{
    NotEligibleException(String msg)
    {
        super(msg);
    }
}

public class ExceptionExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<18){
            throw new NotEligibleException("Your age is less than 18");
        }
        else{
            System.out.println("You are eligible for getting license");
        }

    }
}
