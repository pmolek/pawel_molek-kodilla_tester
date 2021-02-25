public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("pawel", 32);
        User u2 = new User("piotr", 23);
        User u3 = new User("rafał", 45);
        User u4 = new User("karol", 52);
        User u5 = new User("michal", 20);

        User[] users = {u1, u2, u3, u4, u5};
        double average = calculateAverage2(users);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }

    }

    public static double calculateAverage2(User[] users1) {
        double sum = 0;
        for (int i = 0; i < users1.length; i++) {
            sum = sum + users1[i].age;
        }
        double avg = sum / users1.length;
        return avg;
    }
}

