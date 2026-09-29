public class Ex03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Quadrado " + i + " = " + i * i);
            } else {
                System.out.println("Cubo " + i + " = " + i * i * i);
            }

        }
    }
}
