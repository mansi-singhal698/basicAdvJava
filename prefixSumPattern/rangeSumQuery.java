public class rangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};

        // Build prefix sum
        int[] prefix = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // Queries
        System.out.println(prefix[3] - prefix[0]); // sum from 0 to 2
        System.out.println(prefix[6] - prefix[2]); // sum from 2 to 5
        System.out.println(prefix[6] - prefix[0]); // sum from 0 to 5

        //sout(prefix[right+1] - prefix[left])
    }
}