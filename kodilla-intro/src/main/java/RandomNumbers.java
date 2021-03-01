import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int l;
        int sum = 0;
        int min = 30;
        int max = 0;

        Random r = new Random();

        while (sum < 5000) {
            l = r.nextInt(31);

            if (max < l) max = l;
            if (l < min) min = l;
            sum = sum + l;
        }
        System.out.println();
        System.out.println("suma to " + sum);
        System.out.println("największa liczba to " + max);
        System.out.println("najmniejsza liczba to " + min);

    }
}