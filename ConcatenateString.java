public class ConcatenateString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String[] words = {"Hello", "World", "from", "Madhav"};
        for(String str : words){
            sb.append(str).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
