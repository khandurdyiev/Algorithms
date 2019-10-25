import java.util.Random;

public class StarWhiteSpaceMatrix {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int columns = Integer.parseInt(args[1]);

        String res = "";

        Random rand = new Random();

        for (int x = 0; x < columns; x++) {
            res = res + (x + 1) + " ";
        }

        res = "  " + res + "\n";

        for (int i = 0; i < rows; i++) {

            res = res + (i + 1) + " ";

            for (int j = 0; j < columns; j++) {
                boolean point = rand.nextBoolean();
                if (point) {
                    res = res + "* ";
                } else {
                    res = res + "* ";
                }
            }

            res = res + "\n";
        }

        System.out.println(res);
    }
}
