public class GradesTest {


    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(7);
        grades.add(8);
        grades.add(9);
        grades.add(10);

        int l = Grades.grades.length;
        System.out.println("Ostatnia wprowadzona ocena: " +l);

        System.out.println("Srednia ocena: " +Grades.avg());


    }

}

