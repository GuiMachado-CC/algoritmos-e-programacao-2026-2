import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        float nota;

        System.out.println("Digite a nota do aluno de 0 a 10: ");
        nota = input.nextFloat();

        if (nota>10 || nota<0) {
            System.out.println("Nota inválida");
        } else if(nota>=7){
            System.out.println("Aprovado");
        } else if (nota>=4 ){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}