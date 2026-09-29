import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nota = "";
        int idade = 0;
        int otimo = 0;
        int bom = 0;
        int regular = 0;
        int ruim = 0;
        int pessimo = 0;
        int notaTotal = 0;
        double diferencaPercentual;
        int quantIdade = 0;
        double mediaIdade = 0;
        int maiorIdadeP = 0;
        int maiorIdadeO = 0;
        int maiorIdadeR = 0;
        int porcetagemPessimo = 0;
        int totalVotos = 0;
        int diferencaIdade = 0;


        while (!nota.equals("fim")) {

            System.out.println("Digite sua idade: ");
            idade = input.nextInt();
            quantIdade++;

            System.out.print("Digite sua nota:\n" +
                    "A - Ótimo\n" +
                    "B - Bom\n" +
                    "C - Regular\n" +
                    "D - Ruim\n" +
                    "E - Péssimo");
            nota = input.nextLine();
            totalVotos++;

            if (nota.equalsIgnoreCase("fim")) {
                break;
            }


            switch (nota) {
                case "A":
                    otimo++;
                    if(idade > maiorIdadeO) {
                        maiorIdadeO = idade;
                    }
                    break;
                case "B":
                    bom++;
                    break;
                case "C":
                    regular++;
                    break;
                case "D":
                    ruim++;
                    idade += idade;
                    if(idade > maiorIdadeR) {
                        maiorIdadeR = idade;
                    }
                    break;
                case "E":
                    pessimo++;
                    if(idade > maiorIdadeP){
                        maiorIdadeP = idade;
                    }
                    break;
                default:
                    System.out.println("Resposta Inválida");
            }
        }

        System.out.println("Votos: \n" +
                otimo + "\n" +
                bom + "\n" +
                regular + "\n" +
                ruim + "\n" +
                pessimo + "\n");

        notaTotal = otimo + bom + regular + ruim + pessimo;

        if (bom == regular){
            System.out.println("0%");
        } else if (bom > regular) {
            diferencaPercentual = (double) ((bom - regular) / regular)*100;
            System.out.println(diferencaPercentual + "%");
        } else {
            diferencaPercentual = (double) ((regular - bom) / bom)*100;
            System.out.println(diferencaPercentual + "%");
        }

        mediaIdade = (double) idade / quantIdade;
        System.out.println("Media de idade das notas \"ruins\" :" + mediaIdade);

        porcetagemPessimo = (pessimo/totalVotos)*100;
        System.out.println("A porcentegem de avaliações \"péssimo\" foi de " + porcetagemPessimo + "%");
        System.out.println("A maior idade na avaliação \"péssimo foi de " + maiorIdadeP + "%");

        if (maiorIdadeO > maiorIdadeR) {
            diferencaIdade = maiorIdadeO - maiorIdadeP;
        } else if (maiorIdadeO < maiorIdadeR) {
            diferencaIdade = maiorIdadeR - maiorIdadeO;
        } else {
            diferencaIdade = maiorIdadeO - maiorIdadeP;
        }

        System.out.println("A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim é de: " + diferencaIdade);


    }
}
