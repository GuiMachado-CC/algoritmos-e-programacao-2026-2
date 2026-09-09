import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double consumo;
        double valor;

        System.out.println("Consumo de kWh na residência:");
        consumo = input.nextDouble();

        if(consumo <= 100){
            valor = consumo * 0.50;
            System.out.println("O valor da conta de energia elétrica é de R$ " + valor);
        } else if(consumo > 200) {
            valor = consumo * 0.70;
            System.out.println("O valor da conta de energia elétrica é de R$ " + valor);
        } else {
            valor = consumo * 0.90;
            System.out.println("O valor da conta de energia elétrica é de R$ " + valor);
        }

    }
}