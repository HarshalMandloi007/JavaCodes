package TestExample;

import java.io.PrintWriter;
import java.io.StringWriter;

public class AssertExample {
    public static boolean shouldPass = true;

    private String isConnectedToDatabase() {
        try {
            double random = Math.random();
            boolean isGreaterThanPoint5 = random > 0.5;
            if (shouldPass && isGreaterThanPoint5) {
                System.out.println(random + " " + (isGreaterThanPoint5));
            } else {
                throw new RuntimeException("unable to connect to database");
            }
            return "";
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            return stringWriter.toString();
        }
    }

    public static void main(String[] args) {
        new AssertExample().extracted();
        System.out.println("done ");
    }

    public void extracted() {
        String connectedToDatabase = new AssertExample().isConnectedToDatabase();

        assert connectedToDatabase.length() == 0 : connectedToDatabase;
    }
}
