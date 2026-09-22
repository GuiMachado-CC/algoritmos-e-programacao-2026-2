import java.util.Scanner;

public class Ex06 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int senha=0;
        int tentativas=0;

        while(senha != 2026) {
            System.out.println("Insira a senha: ");
            senha = input.nextInt();
            System.out.println("Senha Inválida!\n");
            tentativas++;
        }

        System.out.println("Senha Autorizada!");
        System.out.println("Número de tentativas: " + tentativas);

    }
}
