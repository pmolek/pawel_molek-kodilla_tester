public class rozne {
    public static void main(String[] args) {
        boolean raining = true;
        boolean cold = false;
        boolean night = false;
        if (raining && cold || night) {
            System.out.println("Stay at home.");
        } else {
            System.out.println("Let's go!");
        }
    }
}

