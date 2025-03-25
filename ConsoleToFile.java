import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        String filePath = "output.txt";  // File to write to

        try (
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                FileWriter fileWriter = new FileWriter(filePath, true);  // Append mode
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            System.out.println("Enter text to save to file (type 'exit' to stop):");

            String inputLine;
            while (!(inputLine = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(inputLine);
                bufferedWriter.newLine();  // Move to the next line
            }

            System.out.println("Input saved to " + filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
