import java.util.Scanner;

public class vendas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem Vindos a loja do Roger Yamassaki");

        System.out.println("Digite o valor do pedido: ");
        float valorDoPedido = teclado.nextFloat();


        System.out.println("Digite a quantidade de parcelas: ");
        int qtdParcelas = teclado.nextInt();

        float juros = 0;
        if (qtdParcelas < 4){
            juros = 0/100f;
            System.out.println("Sem juros");
        } else if (qtdParcelas >= 4 && qtdParcelas < 6) {
            juros = 4/100f;
            System.out.println("6% de juros");
        } else if (qtdParcelas >= 6 && qtdParcelas < 9){
            juros = 8/100f;
            System.out.println("8 de juros");
        } else if (qtdParcelas >= 9 && qtdParcelas < 13){
            juros = 13/100f;
            System.out.println("13% de juros");
        } else if (qtdParcelas >= 13){
            juros = 32/100f;
            System.out.println("32% de juros");
        } else {
            System.out.println("Ta ferrado!");
        }

        float valorDaParcela = valorDoPedido*(1+juros)/qtdParcelas;
        float valorTotal = valorDaParcela * qtdParcelas;

        String message = String. format("O valor total é de: R$ %.2f (Parcelas de: %dx, com juros de %.2f)", valorTotal, qtdParcelas ,juros  );

        System.out.println(message);
    }
}
