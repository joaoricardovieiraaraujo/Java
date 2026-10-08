import java.util.Scanner; // Importa a classe Scanner, usada para receber dados do usuário

public class InputEx {
    public static void main(String[] args) {
         // Cria um Scanner para receber informações digitadas pelo usuário
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Olá " + nome + ", seja bem vindo!!");
    }
}
