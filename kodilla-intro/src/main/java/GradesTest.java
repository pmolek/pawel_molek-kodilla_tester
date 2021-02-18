import java.util.Scanner;

public class GradesTest {

    public static void main(String[] args) {
        int[] grades = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int j = i+1;
            System.out.println("Wprowadź ocenę nr " + j + "; ");
            grades[i] = scan.nextInt();
        }

        System.out.println("Ostatnia wprowadzona ocena to: " + grades[9]);

        int suma = 0;

        for (int i = 0; i < grades.length; i++) {
            suma = grades[i] + suma;
        }
        double avg = (double) suma / grades.length;
        System.out.println("Srednia arytmetyczna: " + avg);
    }
}


