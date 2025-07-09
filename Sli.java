public class sli {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int K = 4, start = 0, sum = 0, maxLen = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > K) sum -= arr[start++];
            if (sum == K) maxLen = Math.max(maxLen, end - start + 1);
        }

        System.out.println("Longest Length: " + maxLen);
    }
}
