import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Sprawdzę czy dany rok jest przestępny");
        System.out.println("Podaj rok");

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year%4==0 && year%100!=0 || year%400==0)
        {  System.out.println("W podanym roku wypada rok przestępny");}
        else
        {System.out.println("W podanym roku nie wypada rok przestępny");}

    }
}
