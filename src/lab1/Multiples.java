package lab1;

public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
