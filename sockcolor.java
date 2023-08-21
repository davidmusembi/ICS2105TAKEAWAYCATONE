package ICS2105TAKEAWAYCATONE;
public class sockcolor {
    static int sockMerchant(int n, int[] ar) {
        // Initialize an array to store the frequency of each color
        int[] freq = new int[101];
        // Count the frequency of each color
        for (int i = 0; i < n; i++)
            freq[ar[i]]++;
        // Count the number of pairs for each color
        int pairs = 0;
        for (int i = 0; i < 101; i++)
            pairs += freq[i] / 2;
        // Return the total number of pairs
        return pairs;
    }

    public static void main(String[] args) {
        // Initialize the array of socks and its size
        int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = arr.length;
        // Count the number of pairs
        int result = sockMerchant(n, arr);
        // Print the result
        System.out.println(result);
    }
}
