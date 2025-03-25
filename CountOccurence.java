import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurence {
    public static void main(String[] args) {
        String file = "Readme.txt";
        String target = "test";
        int count = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.toLowerCase().split("\\s+");
                for (String word:words){
                    word = word.replaceAll("[^a-zA-Z]","");
                    if(word.equals(target)){
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Count: "+count);
    }
}
