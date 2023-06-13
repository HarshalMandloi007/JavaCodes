import java.util.Optional;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        System.out.println("Reverse of a String " + str + " is :");
        reverseString(str);
    }

    public static Optional<String> returnEmptyIfNullElseReverse(String str) {
        if (str == null) {
           return Optional.empty();
        } else {
            return Optional.of(reverseString(str));
        }
    }

    private static String reverseString(String str) {
        int i = str.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (i > 0) {
            stringBuilder.append(str.charAt(i - 1));
            System.out.print(str.charAt(i - 1));
            i--;
        }
        return stringBuilder.toString();
    }
}
