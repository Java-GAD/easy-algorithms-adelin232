public class HelloWorld {

    public static void main(String[] args) {
        fizzBuzz(100);
        System.out.println();
        printingPatternTriangle(5);
    }

    public static void printingPatternTriangle(int n) {
        int nextNumberToBePrinted = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                nextNumberToBePrinted++;
                System.out.print(nextNumberToBePrinted + " ");
            }
            System.out.println();
        }
    }

    public static void fizzBuzz(int n) {
        if (n <= 1) {
            System.out.println("Please introduce a positive number");
        }

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
