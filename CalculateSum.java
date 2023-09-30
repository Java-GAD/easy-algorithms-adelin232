import java.util.stream.IntStream;

public class CalculateSum {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculateSum(n));
    }

    public static int calculateSum(int n) {
        if (n < 0 || n > 10000) {
            return -1;
        }

        return IntStream.rangeClosed(1, n).sum();
    }
}
