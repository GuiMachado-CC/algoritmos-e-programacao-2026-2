import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int candidato = 0;
        int notaAugusto = 0;
        int notaFlavio = 0;
        int notaRenan = 0;
        int notaRonaldo = 0;
        int notaLula = 0;

        System.out.println("------- Democratize -------");
        System.out.println("");

        while (candidato != 6){
        System.out.println("Lista dos candidatos:");
            System.out.println("1 - Augusto Cury");
            System.out.println("2 - Flávio Bolsonaro");
            System.out.println("3 - Renan Santos");
            System.out.println("4 - Ronaldo Caiado");
            System.out.println("5 - Lula");
            System.out.println("6 - Encerrar Programa");

            System.out.println("");

            System.out.println("Insira uma opção: ");
            candidato = input.nextInt();

            switch (candidato) {
                case 1:
                    System.out.println("Augusto Cury (Avante)");
                    System.out.println("");
                    System.out.println("Educação: escolas em tempo integral, alfabetização e valorização dos professores.\n" +

                            "Saúde mental: programas de apoio emocional e prevenção de problemas psicológicos.\n" +

                            "Saúde pública: ampliação da telemedicina e prevenção do câncer.\n" +

                            "Economia: incentivo ao empreendedorismo, redução de gastos públicos e simplificação de impostos.\n" +

                            "Segurança: combate às facções criminosas com uso de tecnologia e inteligência.");
                    System.out.println("");
                    System.out.print("Dê uma nota de 0 a 10 para esta proposta: ");
                    notaAugusto = input.nextInt();

                    if(notaAugusto > 10){
                    notaAugusto = 10;
                    } else if(notaAugusto < 10){
                        notaAugusto = 0;
                    }

                    System.out.println("Nota salva!");
                    break;
                case 2:
                    System.out.println("Flávio Bolsonaro (PL)");
                    System.out.println("");
                    System.out.println("Segurança: combate rigoroso às facções criminosas, com bloqueio de seus recursos financeiros.\n" +

                            "Economia: apoio a pequenos negócios, empreendedores e profissionais autônomos.\n" +

                            "Saúde: ampliação da telemedicina e integração dos prontuários eletrônicos.\n" +

                            "Justiça: propostas de endurecimento das punições contra criminosos.");
                    System.out.println("");
                    System.out.print("Dê uma nota de 0 a 10 para esta proposta: ");
                    notaFlavio = input.nextInt();

                    if(notaFlavio > 10){
                        notaFlavio = 10;
                    } else if(notaFlavio < 10){
                        notaFlavio = 0;
                    }

                    System.out.println("Nota salva!");
                    break;
                case 3:
                    System.out.println("Renan Santos (Missão)");
                    System.out.println("");
                    System.out.println("Segurança: combate intenso à violência urbana e ao crime organizado.\n" +

                            "Economia: ajuste das contas públicas e redução de benefícios fiscais.\n" +

                            "Assistência social: reformulação dos programas sociais e mudanças nas regras de benefícios.\n" +

                            "Moradia: regularização fundiária e propostas para reduzir a precariedade habitacional.");
                    System.out.println("");
                    System.out.print("Dê uma nota de 0 a 10 para esta proposta: ");
                    notaRenan = input.nextInt();

                    if(notaRenan > 10){
                        notaRenan = 10;
                    } else if(notaRenan < 10){
                        notaRenan = 0;
                    }

                    System.out.println("Nota salva!");
                    break;
                case 4:
                    System.out.println("Ronaldo Caiado (PSD)");
                    System.out.println("");
                    System.out.println("Segurança: combate ao crime organizado e às facções criminosas.\n" +

                            "Corrupção: investigação de fraudes e desvio de dinheiro público.\n" +

                            "Saúde: fortalecimento do SUS e melhoria do atendimento.\n" +

                            "Economia: controle dos gastos públicos e melhoria da gestão do governo.");
                    System.out.println("");
                    System.out.print("Dê uma nota de 0 a 10 para esta proposta: ");
                    notaRonaldo = input.nextInt();

                    if(notaRonaldo > 10){
                        notaRonaldo = 10;
                    } else if(notaRonaldo < 10){
                        notaRonaldo = 0;
                    }

                    System.out.println("Nota salva!");
                    break;
                case 5:
                    System.out.println("Lula (PT)");
                    System.out.println("");
                    System.out.println("Trabalho: defesa do fim da escala 6x1 e redução da jornada semanal sem corte salarial.\n" +

                            "Economia: valorização do salário mínimo e incentivo à indústria brasileira.\n" +

                            "Programas sociais: combate à fome e à desigualdade social.\n" +

                            "Saúde e educação: fortalecimento dos serviços públicos e ampliação do atendimento à população.");
                    System.out.println("");
                    System.out.print("Dê uma nota de 0 a 10 para esta proposta: ");
                    notaLula = input.nextInt();


                    if(notaLula > 10){
                        notaLula = 10;
                    } else if(notaLula < 10){
                        notaLula = 0;
                    }

                    System.out.println("Nota salva!");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

}

        System.out.println("\n=======================================");
        System.out.println("                         RESUMO DAS NOTAS SALVAS          ");
        System.out.println("=======================================");
        System.out.println("Augusto Cury: " + notaAugusto);
        System.out.println("Flávio Bolsonaro: " + notaFlavio);
        System.out.println("Renan Santos: " + notaRenan);
        System.out.println("Ronaldo Caiado: " + notaRonaldo);
        System.out.println("Lula: " + notaLula);
        System.out.println("========================================");


    }
}
