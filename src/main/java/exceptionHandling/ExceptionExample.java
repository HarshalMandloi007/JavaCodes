package exceptionHandling;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();

        try {
            int x = a/3;
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }
    }
}
