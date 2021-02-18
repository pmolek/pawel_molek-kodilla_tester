public class ApplicationTest {
    public static void main(String[] args) {
      Application application = new Application("pawel", 32, 179);

        if (application.name != null) {
            if (application.age > 30 && application.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
