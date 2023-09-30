import java.util.stream.IntStream;

public class FactorialNum {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculateFactorial(n));
        System.out.println(calculateFactorial2(n));
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }

    public static int calculateFactorial2(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
}
