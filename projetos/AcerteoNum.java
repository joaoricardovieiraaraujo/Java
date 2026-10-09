import java.util.Random;
import java.util.Scanner;

public class AcerteoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("TENTE ACERTAR O NÚMERO QUE ESTOU PENSANDO");
        System.out.println("Digite um numero de 0 a 5:");
        int computador = random.nextInt(5) + 1;
        int j = input.nextInt();
        if (j == computador) {
            System.out.println("PARÁBENS VOCÊ ACERTOU O NÚMERO QUE EU ESTAVA PENSANDO!!");
        }else if (j > 5 || j <= 0) {
            System.out.println("NÚMERO INVÁLIDO TENTE NOVAMENTE.");
        }else {
            System.out.println("QUE PENA VOCÊ ERROU!! O NÚMERO QUE EU ESTAVA PENSANDO ERA " + computador);
        }
    }
}
