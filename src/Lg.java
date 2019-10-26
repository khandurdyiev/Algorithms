public class Lg {
    public static int lg(int N) {
        int x = 1;
        int i = 0;

        while (x <= N) {
            x *= 2;
            i++;
        }

        return i - 1;
    }

    public static void main(String[] args) {
        System.out.println(lg(65));
    }
}
