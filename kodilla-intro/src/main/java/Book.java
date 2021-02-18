import java.util.Scanner;

public class Book {
    private static String of;
    private  String author;
    private  String title;

    public static void of() {

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter author:");
            author = scan.nextLine().trim();
            if (author.length() >= 2) {

                while (true) {
                    System.out.println("Enter title:");
                    title = scan.nextLine().trim();
                    if (title.length() >= 2)
                        return;
                }
            }
        }
    }
}

