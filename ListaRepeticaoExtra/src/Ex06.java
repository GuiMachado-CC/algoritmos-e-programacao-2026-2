import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limiteSuperior;
        int limiteInferior;
        int somaPares = 0;

        System.out.print("Digite o limite inferior: ");
        limiteInferior = input.nextInt();

        System.out.print("Digite o limite superior: ");
        limiteSuperior = input.nextInt();

        for(int i = ++limiteInferior; i<limiteSuperior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                somaPares += i;
            }
        }
        System.out.println("Somatório: " + somaPares);


    }
}
