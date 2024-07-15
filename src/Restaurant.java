import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindos a lojas de Marmita do Roger Yama");
        System.out.println("""
                ------------------Menu--------------------
                Tamanho| Bife Acebolado(BA)| Filé de frango(FF)
                   P           R$16.00             R$15.00
                   M           R$18.00             R$17.00
                   G           R$22.00             R$21.00""");

        int total = 0;
        int valor = 0;
        while (true) {
            System.out.println("Escolha entre os sabores da casa = (BA/FF)");
            String sabor = teclado.nextLine();

            if (!sabor.equals("BA") && !sabor.equals("FF")) {
                System.out.println("Prato Inexistente");
                continue;
            }

            System.out.println("Escolha o tamanho do prato:");
            String tamanho = teclado.nextLine();

            if (sabor.equalsIgnoreCase("BA")) {
                System.out.println("Boa escolha");
                if (tamanho.equalsIgnoreCase("P")) {
                    valor = 16;
                    System.out.println("Tamanho Pequeno");

                } else if (tamanho.equalsIgnoreCase("M")) {
                    valor = 18;
                    System.out.println("Tamanho Médio");

                } else if (tamanho.equalsIgnoreCase("G")) {
                    valor = 22;
                    System.out.println("Tamanho Grande");

                } else {
                    System.out.println("Tamanho inexistente");
                    continue;
                }
            } else if (sabor.equalsIgnoreCase("FF")) {
                System.out.println("File de frango");
                if (tamanho.equalsIgnoreCase("P")) {
                    valor = 15;
                    System.out.println("Tamanho Pequeno");

                } else if (tamanho.equalsIgnoreCase("M")) {
                    valor = 17;
                    System.out.println("Tamanho Médio");

                } else if (tamanho.equalsIgnoreCase("G")) {
                    valor = 22;
                    System.out.println("Tamanho Grande");

                } else {
                    System.out.println("Tamanho inextistente");
                    continue;
                }
            }

            total += valor;
            System.out.println("Deseja algo mais?");
            String resposta = teclado.nextLine().toUpperCase();
            if (resposta.equals("N")){
                valor++;
                break;
            }
        }
        System.out.println("O valor total ficou: " + total+ "R$");






    }
}
