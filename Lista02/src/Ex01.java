import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeNadador;

        System.out.println("Validação da idade do nadador");
        System.out.println("Digite a idade do nadador: ");
        idadeNadador = input.nextInt();

        if (idadeNadador <= 0) {
            System.out.println("Idade inválida");
        }else if (idadeNadador >= 18) {
            System.out.println("Adulto");
        }else if (idadeNadador >= 13) {
            System.out.println("Juvenil");
        }else{
            System.out.println("Infantil");
        }
    }
}