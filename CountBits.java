public class CountBits {

    public static void main(String[] args) {
        int n = 25;
        int[] result = countBits(n);

        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i <= n; i++) {
//            System.out.println(Integer.toString(i, 2));
            System.out.print(Integer.bitCount(i) + " ");
        }
    }

    public static int[] countBits(int n) {
        int i;
        int[] ans = new int[n + 1];

        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans[i] = ans[i / 2];
            } else {
                ans[i] = ans[i - 1] + 1;
            }
        }

        return ans;
    }
}
