import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;


public class ex {
    // Variáveis globais para armazenar as notas
    private static int notaAugusto = 0;
    private static int notaFlavio = 0;
    private static int notaRenan = 0;
    private static int notaRonaldo = 0;
    private static int notaLula = 0;


    public static void main(String[] args) {
        // Configuração da janela principal
        JFrame frame = new JFrame("Democratize");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500); // Aumentado levemente para acomodar o novo botão
        frame.setLayout(new BorderLayout(10, 10));


        // Título principal
        JLabel titulo = new JLabel("------- Democratize -------", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(titulo, BorderLayout.NORTH);


        // Painel para os botões dos candidatos e opções adicionais
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(7, 1, 5, 5));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));


        JButton btnAugusto = new JButton("1 - Augusto Cury");
        JButton btnFlavio = new JButton("2 - Flávio Bolsonaro");
        JButton btnRenan = new JButton("3 - Renan Santos");
        JButton btnRonaldo = new JButton("4 - Ronaldo Caiado");
        JButton btnLula = new JButton("5 - Lula");
        JButton btnLinkTSE = new JButton("6 - Ver Propostas Completas (TSE)");
        JButton btnEncerrar = new JButton("7 - Encerrar e Ver Resumo");


        // Estilização básica das novas opções
        btnLinkTSE.setBackground(new Color(0, 123, 255)); // Azul institucional
        btnLinkTSE.setForeground(Color.WHITE);


        btnEncerrar.setBackground(new Color(220, 53, 69)); // Vermelho de encerramento
        btnEncerrar.setForeground(Color.WHITE);


        painelBotoes.add(btnAugusto);
        painelBotoes.add(btnFlavio);
        painelBotoes.add(btnRenan);
        painelBotoes.add(btnRonaldo);
        painelBotoes.add(btnLula);
        painelBotoes.add(btnLinkTSE);
        painelBotoes.add(btnEncerrar);


        frame.add(painelBotoes, BorderLayout.CENTER);


        // Ações dos botões dos candidatos
        btnAugusto.addActionListener(e -> abrirJanelaCandidato(frame, "Augusto Cury (Avante)",
                "Educação: escolas em tempo integral, alfabetização e valorização dos professores.\n" +
                        "Saúde mental: programas de apoio emocional e prevenção de problemas psicológicos.\n" +
                        "Saúde pública: ampliação da telemedicina e prevenção do câncer.\n" +
                        "Economia: incentivo ao empreendedorismo, redução de gastos públicos e simplificação de impostos.\n" +
                        "Segurança: combate às facções criminosas com uso de tecnologia e inteligência.", 1));


        btnFlavio.addActionListener(e -> abrirJanelaCandidato(frame, "Flávio Bolsonaro (PL)",
                "Segurança: combate rigoroso às facções criminosas, com bloqueio de seus recursos financeiros.\n" +
                        "Economia: apoio a pequenos negócios, empreendedores e profissionais autônomos.\n" +
                        "Saúde: ampliação da telemedicina e integração dos prontuários eletrônicos.\n" +
                        "Justiça: propostas de endurecimento das punições contra criminosos.", 2));


        btnRenan.addActionListener(e -> abrirJanelaCandidato(frame, "Renan Santos (Missão)",
                "Segurança: combate intenso à violência urbana e ao crime organizado.\n" +
                        "Economia: ajuste das contas públicas e redução de benefícios fiscais.\n" +
                        "Assistência social: reformulação dos programas sociais e mudanças nas regras de benefícios.\n" +
                        "Moradia: regularização fundiária e propostas para reduzir a precariedade habitacional.", 3));


        btnRonaldo.addActionListener(e -> abrirJanelaCandidato(frame, "Ronaldo Caiado (PSD)",
                "Segurança: combate ao crime organizado e às facções criminosas.\n" +
                        "Corrupção: investigação de fraudes e desvio de dinheiro público.\n" +
                        "Saúde: fortalecimento do SUS e melhoria do atendimento.\n" +
                        "Economia: controle dos gastos públicos e melhoria da gestão do governo.", 4));


        btnLula.addActionListener(e -> abrirJanelaCandidato(frame, "Lula (PT)",
                "Trabalho: defesa do fim da escala 6x1 e redução da jornada semanal sem corte salarial.\n" +
                        "Economia: valorização do salário mínimo e incentivo à indústria brasileira.\n" +
                        "Programas sociais: combate à fome e à desigualdade social.\n" +
                        "Saúde e educação: fortalecimento dos serviços públicos e ampliação do atendimento à população.", 5));


        // Ação para abrir o link do TSE
        btnLinkTSE.addActionListener(e -> {
            try {
                URI uri = new URI("https://www.tse.jus.br/eleicoes/eleicoes-2026-content/propostas-de-governo-dos-candidatos-ao-cargo-de-presidente-da-republica-eleicoes-2026");
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(uri);
                } else {
                    JOptionPane.showMessageDialog(frame, "Não foi possível abrir o navegador automaticamente.\nLink: " + uri, "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao tentar abrir o link.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });


        // Ação para encerrar o programa e mostrar o resumo
        btnEncerrar.addActionListener(e -> {
            String resumo = "=======================================\n" +
                    "          RESUMO DAS NOTAS SALVAS      \n" +
                    "=======================================\n" +
                    "Augusto Cury: " + notaAugusto + "\n" +
                    "Flávio Bolsonaro: " + notaFlavio + "\n" +
                    "Renan Santos: " + notaRenan + "\n" +
                    "Ronaldo Caiado: " + notaRonaldo + "\n" +
                    "Lula: " + notaLula + "\n" +
                    "=======================================";
            JOptionPane.showMessageDialog(frame, resumo, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        });


        // Centralizar e mostrar a janela
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    // Método para abrir o painel de votação de cada candidato
    private static void abrirJanelaCandidato(JFrame parent, String nomeCandidato, String propostas, int idCandidato) {
        JDialog dialog = new JDialog(parent, nomeCandidato, true);
        dialog.setSize(500, 350);
        dialog.setLayout(new BorderLayout(10, 10));


        // Texto das propostas
        JTextArea txtPropostas = new JTextArea(propostas);
        txtPropostas.setEditable(false);
        txtPropostas.setLineWrap(true);
        txtPropostas.setWrapStyleWord(true);
        txtPropostas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JScrollPane scroll = new JScrollPane(txtPropostas);
        dialog.add(scroll, BorderLayout.CENTER);


        // Painel inferior para inserção da nota
        JPanel painelVoto = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel lblNota = new JLabel("Dê uma nota de 0 a 10: ");
        JTextField txtNota = new JTextField(5);
        JButton btnSalvar = new JButton("Salvar Nota");


        painelVoto.add(lblNota);
        painelVoto.add(txtNota);
        painelVoto.add(btnSalvar);
        dialog.add(painelVoto, BorderLayout.SOUTH);


        btnSalvar.addActionListener(e -> {
            try {
                int nota = Integer.parseInt(txtNota.getText());


                // Validação de limites da nota
                if (nota > 10) {
                    nota = 10;
                } else if (nota < 0) {
                    nota = 0;
                }


                // Salva na variável correta
                switch (idCandidato) {
                    case 1 -> notaAugusto = nota;
                    case 2 -> notaFlavio = nota;
                    case 3 -> notaRenan = nota;
                    case 4 -> notaRonaldo = nota;
                    case 5 -> notaLula = nota;
                }


                JOptionPane.showMessageDialog(dialog, "Nota " + nota + " salva com sucesso!");
                dialog.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dialog, "Por favor, insira um número válido inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });


        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    }
}

