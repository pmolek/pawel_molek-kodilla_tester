import java.util.Random;
import java.util.Scanner;

public class Loops {
    private int max;

    public static void main(String[] args) {
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
        System.out.println(random);
    }
}