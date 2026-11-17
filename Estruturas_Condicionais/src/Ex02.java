import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        if ( idade >=18){
            System.out.println("Idade válida");
        } else {
            System.out.println("Idade inválida");
        }

    }
}