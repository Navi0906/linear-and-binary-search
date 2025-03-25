import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        String str = "programming";
        for(char c : str.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c);
            }
        }

        System.out.println("Original String: "+str);
        System.out.println("Without Duplicates: "+result);

    }
}
