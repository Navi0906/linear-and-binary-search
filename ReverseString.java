public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        String reverse = sb.reverse().toString();
        System.out.println(reverse);
    }
}
