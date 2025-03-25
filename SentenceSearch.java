public class SentenceSearch {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the first matching sentence
            }
        }
        return "Not Found"; // Return if no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is a powerful language.",
                "Linear search is simple but slow.",
                "Data structures and algorithms are important.",
                "Always write efficient code."
        };

        String word = "search"; // Word to search for
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence found: " + result);
    }
}
