import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x;
        double resultado;

        System.out.println("Raízes de uma equação do segundo grau)");
        System.out.println("Digite o valor de x: ");
        x = input.nextDouble();

        if (x <= 1){
            resultado = 1;
        } else if (1 < x && x <= 2){
            resultado = 2;
        }  else if (2 < x && x <= 3){
            resultado = x * x;
        } else {
            resultado = x * x * x;
        }

        System.out.println("O resultado de f(x) é: \n" + resultado);

    }
}