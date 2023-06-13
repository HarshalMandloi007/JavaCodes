package exceptionHandling;

import java.util.Scanner;

public class ExceptionExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();

        try {
            int x = a/0;
            System.out.println(x);
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception Handled");
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("ArrayIndexOutOfBond Exception Handled");
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }
        finally {
            System.out.println("This code always be executed");
        }
    }}
