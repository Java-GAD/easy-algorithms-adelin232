public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("string".toCharArray()));
    }

    public static char[] reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }

        return s;
    }
}
