public class Grades {

    public static int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }

        this.grades[this.size] = value;
        this.size++;

    }

    public static double avg() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        double a = sum / grades.length;
        return a;
    }

}


