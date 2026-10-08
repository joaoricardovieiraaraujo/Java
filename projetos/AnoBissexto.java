import java.time.LocalDate;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        LocalDate hj = LocalDate.now();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano que quer verificar: ");
        int ano = input.nextInt();
        System.out.println("Você esta no ano " + hj + " e quer verificar se " + ano + " e bissexto.");
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é Bissexto" );
        }else {
            System.out.println("O ano " + ano + " não é Bissexto");
        }
    }
}
