import java.util.InputMismatchException;
import java.util.Scanner;

public class Fabrica {
    static Scanner teclado = new Scanner(System.in);
    public static float escolha_modelo(){

        float valor = 0;
        while (true) {
            System.out.println("""
                   Qual o modelo desejado ?
                   Camisa Curta Simples(MCS)
                   Camisa Longa Simples(MLS)
                   Camisa Curta com Estampa(MCE)
                   Camisa Longa com Estampa(MLE)""");
            String pergunta = teclado.nextLine().toUpperCase();

            switch (pergunta) {
                case "MCS":
                    valor = 1.80f;
                    System.out.println("Camisa Curta Simples");
                    return valor; // Sai do método após escolha válida
                case "MLS":
                    System.out.println("Camisa Longa Simples");
                    valor = 2.10f;
                    return valor; // Sai do método após escolha válida
                case "MCE":
                    valor = 2.90f;
                    System.out.println("Camisa Curta com Estampa");
                    return valor; // Sai do método após escolha válida
                case "MLE":
                    valor = 3.20f;
                    System.out.println("Camisa Longa com Estampa");
                    return valor; // Sai do método após escolha válida
                default:
                    System.out.println("Modelo não encontrado. Por favor, escolha novamente.");
                    continue; // Continua o loop para nova pergunta
            }
        }
    }

    public static float [] num_camisa() {
        float pergunta;
        float resultados[] = new float[2];
        while (true) {
            try {
                System.out.println("Qual a quantidade de camisas?");
                pergunta = teclado.nextFloat();

                if (pergunta < 20) {
                    resultados[0] = pergunta;
                    resultados[1] = 0.0f;
                    System.out.println("Sem desconto");
                    break;
                } else if (pergunta >= 20 && pergunta < 200) {
                    resultados[0] = pergunta;
                    resultados[1] = 0.05f;
                    System.out.println("desconto será de 5%");
                    break;
                } else if (pergunta >= 200 && pergunta < 2000) {
                    resultados[0] = pergunta;
                    resultados[1] = 0.07f;
                    System.out.println("Desconto de 7%");
                    break;
                } else if (pergunta >= 2000 && pergunta <= 20000) {
                    resultados[0] = pergunta;
                    resultados[1] = 0.12f;
                    System.out.println("Desconto de 12%");
                    break;
                } else {
                    System.out.println("Não aceitamos pedidos acima de 20000! Por gentileza tente denovo");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor escreva apenas por número");
                teclado.next();
                continue;
            } finally {
            }
        }
        return resultados;
    }

    public static int frete(){
        int add = 0;
        while (true) {
            System.out.println("""
                    Escolha o tipo de frete: 
                    1 - Transportadora = 100R$
                    2 - SEDEX = 200R$
                    3 - Retirar diretamente = 0R$""");
            int taxa = teclado.nextInt();

            if(taxa == 1){
                add = 100;
                System.out.println("O valor é de 100R$");
                break;
            }else if(taxa == 2){
                add = 200;
                System.out.println("O valor é de 200R$");
                break;
            }else if(taxa == 3){
                add = 0;
                System.out.println("Retirar é de graça");
                break;
            }else {
                System.out.println("Escolha um dos 3 tipos");
                continue;
            }

        }
        return add;
    }

    public static void main(String[] args) {
        float modelo = escolha_modelo();
        float[]numeros = num_camisa();
        float desconto = numeros[1];
        int frete = frete();

        float total = (modelo * numeros[0]) *(1 - desconto) + frete;

        System.out.println("Voce escolheu o modelo: " + modelo + " quantidades: " + numeros[1] + " com o frete " + frete+ " = Total:" + total );

    }
}

