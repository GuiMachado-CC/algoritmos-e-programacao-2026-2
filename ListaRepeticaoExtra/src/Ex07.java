import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite1 = 0;
        int limite2 = 0;

        System.out.print("Digite o limite 1: ");
        limite1 = input.nextInt();

        System.out.print("Digite o limite 2: ");
        limite2 = input.nextInt();

        if(limite1 < limite2){
          for(int i = limite1; i<=limite2; i++) {
            System.out.println(i);
            }
        } else {
            for(int i = limite1; i>=limite2; i--) {
                System.out.println(i);
            }
        }

    }
}
