import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        System.out.println("Em que ano vc nasceu? ");
    int nasc = t.nextInt();
    int i = 2024-nasc;
        System.out.println("Sua idade é " + i);
    if (i>=18){
        System.out.println("Voce é maior de idade");
    }else {
        System.out.println("Voce é menor de idade");
    }
    }
}