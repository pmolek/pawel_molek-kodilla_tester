public class Application {
    String name;
    double age;
    double height;


    public Application(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;

        if (name.isEmpty() ||age == 0 || height == 0) {
            System.out.println("Niekompletne dane");
        } else if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }

    }
}
