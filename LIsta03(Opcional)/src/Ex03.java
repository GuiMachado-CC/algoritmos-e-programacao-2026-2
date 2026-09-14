import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        double massa;
        int gotas;

        System.out.println("Dosagem do medicamento\n");
        System.out.println("Digite a idade: ");
        idade = input.nextInt();
        System.out.println("Digite a massa (kg): ");
        massa = input.nextDouble();

        if(idade >= 12 && massa >= 60){
            gotas = 40;
        } else if(idade >= 12 && massa < 60){
            gotas = 35;
        }else if (idade < 12 && massa >= 5 && massa <= 9){
            gotas = 5;
        }else if (idade < 12 && massa >= 9.1 && massa <= 16){
            gotas = 10;
        }else if (idade < 12 && massa >= 16.1 && massa <= 24){
            gotas = 15;
        }else if (idade < 12 && massa >= 24.1 && massa <= 30){
            gotas = 20;
        }else{
            gotas = 30;
        }

        System.out.println("Gotas: " + gotas);
    }
}