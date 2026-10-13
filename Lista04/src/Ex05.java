import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] peso = new double[6];
        String[] caixa = {"Caixa 1: ", "Caixa 2: ", "Caixa 3: ",  "Caixa 4: ", "Caixa 5: ", "Caixa 6: " };
        double ref;
        int contador = 0;

        for (int i = 0; i < peso.length; i++) {
            System.out.println(caixa[i]);
            peso[i] = input.nextDouble();
        }

        System.out.println("Digite um peso de Referência: ");
        ref = input.nextDouble();

        for (int i = 0; i < peso.length; i++) {
            if (peso[i] == ref) {
                contador++;
            }
        }

        if (contador > 0){
            System.out.println("Contador de pesos de referência encontrados: " + contador);
        } else {
            System.out.println("Valor não localizado na amostragem");
        }

    }
}
