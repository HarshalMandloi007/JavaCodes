package StringHandling;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello This is a java");
        sb.append(" programming");
        System.out.println(sb);

        sb.insert(5,",");
        System.out.println(sb);

        sb.replace(6,11,"It");
        System.out.println(sb);

        sb.delete(12,14);
        System.out.println(sb);
    }
}
