import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float temp = 0;
        float media;
        int tentativas = 0;
        int maiorTrinta = 0;
        float soma = 0;

        while (temp != -111){

            System.out.print("Digite um temperatura (°C): ");
            temp = input.nextFloat();

            if (temp != -111){
                soma += temp;
                tentativas ++;

                if (temp > 30){
                    maiorTrinta++;

                }
            }

            if(temp == -111){
                media = soma/tentativas;
                System.out.println("Média: " + media);
                System.out.println("Alertas de calor: " + maiorTrinta);
                break;
            }

        }

    }
}