public class UserTest {
        public static void main(String[] args) {
            User u1 = new User("pawel", 32);
            User u2 = new User("piotr", 23);
            User u3 = new User("rafał", 45);
            User u4 = new User("karol", 52);
            User u5 = new User("michal", 20);

            User[] users = {u1, u2, u3, u4, u5};

            sumAndDisplay(u1.age, u2.age, u3.age, u4.age, u5.age);


        }

        private static void sumAndDisplay(int age, int age1, int age2, int age3, int age4) {
            int result = (age + age1 + age2 + age3 + age4);
            double averageAge;
            int numberOfElements = User.length;
            averageAge = result/numberOfElements;
            System.out.println("Srednia wieku to " + averageAge);

        }

}

