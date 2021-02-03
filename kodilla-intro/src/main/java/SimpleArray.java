public class SimpleArray {
    public static void main(String[] args) {
        String[] writers = new String[]{"Larsson", "Lackberg", "Hjorth", "Rosenfeld", "Nesser"};

        String writer = writers[2];
        int numberOfElements = writers.length;
        System.out.println(writer);
        System.out.println("W mojej tablicy jest " + numberOfElements + " nazwisk.");
    }
}