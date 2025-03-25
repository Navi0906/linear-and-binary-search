public class LinearSearch {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;  // Return index of first negative number
            }
        }
        return -1;  // No negative number found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, -4, 6, -2, 7};  // Example array
        int result = findFirstNegative(numbers);

        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
