package StringHandling;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        s = s + " ";
        String w="";
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch!=' ')
            {
                w = w + ch;
            }else {
                System.out.println(w.charAt(0)+" ");
                w="";
            }
        }
    }
}
