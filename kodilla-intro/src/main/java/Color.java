public class Color {
    public static String color() {
        String userColor = UserDialogs.getUserSelection2();

        switch (userColor) {
            case "B":
                System.out.println("biały");
                break;
            case "C":
                System.out.println("czarny");
                break;
            case "N":
                System.out.println("niebieski");
                break;
            case "Z":
                System.out.println("zielony");
                break;
        }
        return userColor;
    }
}