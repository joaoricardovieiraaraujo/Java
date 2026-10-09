import java.util.Scanner;

public class CaixaEle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 100.0;
        while (true) {
            System.out.println("==== CAIXA ELETRONICO ====");
            System.out.println("[ 1 ] - Consultar saldo");
            System.out.println("[ 2 ] - Sacar dinheiro");
            System.out.println("[ 3 ] - Depositar dinheiro");
            System.out.println("[ 4 ] - Sair");
            System.out.println("Opção:");
            int op = input.nextInt();
            
            if (op == 1) {
             System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
            }
            
            else if (op == 2) {
                System.out.println("Quantos deseja sacar? R$");
                double sq = input.nextDouble();
                
                if (sq > 0 && sq <= saldo) {
                    saldo -= sq;
                    System.out.printf("Seu saldo agora é de: R$ %.2f%n", saldo);
                }
                
                else if (sq <= 0) {
                    System.out.println("Valor de saque inválido!");
                }

                else {
                    System.out.println("Saldo insuficiente!");
                }

            }
            
            else if (op == 3) {
                System.out.println("Quantos deseja depositar: R$");
                double dp = input.nextDouble();
                
                if (dp > 0) {
                    saldo = dp + saldo;
                    System.out.println("Seu deposito de R$ " + dp + " foi concluido com sucesso!");
                    System.out.printf("Seu saldo agora é de: R$ %.2f%n", saldo);
                }
                
                else {
                    System.out.println("Valor inválido.");
                }
            }

            else if (op == 4) {
                System.out.println("==== PROGRAMA ENCERRADO ====");
                input.close();
                break;
            }

            else {
                System.out.println("OPÇÃO INVÁLIDA TENTE NOVAMENTE!!!");
            }

        }
    }
}
