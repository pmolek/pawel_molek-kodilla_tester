public class ApplicationTest {
    public static void main(String[] args) {
        Application application = new Application("pawel", 32, 179);
        System.out.println(" Uzytkownik " + application.name );
        System.out.println(" wiek  " + application.age);
        System.out.println(" wzrost  " + application.height);

        if (application.verifyName()) {
            if (application.verifyAge() && application.verifyHeigth()) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }


}

