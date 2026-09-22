import java.util.Scanner;

public class Ex06Extra {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String senha = "2026";
        String senha2="";
        int tentativas = 0;


        while(!senha.equalsIgnoreCase(senha2)) {
            System.out.println("Insira a senha: ");
            senha2 = input.nextLine();
            tentativas++;
            if(senha.equalsIgnoreCase(senha2)) {
                System.out.println("Senha válida");
                System.out.println("Número de tentativas: " + tentativas);
                break;
            }
            System.out.println("Senha Inválida!");
        }



    }
}
